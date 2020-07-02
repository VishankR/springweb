package com.caveofprogramming.spring.web.DAOs;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.stereotype.Component;

@Component("offersdao")
public class OffersDAO {
	//private JdbcTemplate jdbc;
	private NamedParameterJdbcTemplate jdbc;
	@Autowired
	public void setDataSource(DataSource datasource) {
		//this.jdbc = new JdbcTemplate(datasource);
		this.jdbc = new NamedParameterJdbcTemplate(datasource);
	}
	public List<Offer> getOffers(){
		MapSqlParameterSource params = new MapSqlParameterSource();
		//params.addValue("name", "Sue");
		//where name=:name
		return jdbc.query("select * from offers", params, new RowMapper<Offer>() {

			public Offer mapRow(ResultSet rs, int rowNum) throws SQLException {
				Offer offer = new Offer();
				offer.setId(rs.getInt("id"));
				offer.setName(rs.getString("name"));
				offer.setEmail(rs.getString("email"));
				offer.setText(rs.getString("text"));
				return offer;
			}			
		});
	}
	
	public boolean create(Offer offer) {
		BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(offer);
		return jdbc.update("Insert into offers (name, text, email) values (:name, :text, :email)", params) ==1;
	}
	public int[] create(List<Offer> offers) {
		SqlParameterSource[] params = SqlParameterSourceUtils.createBatch(offers.toArray());
		return jdbc.batchUpdate("Insert into offers (name, text, email) values (:name, :text, :email)", params);
	}
}
