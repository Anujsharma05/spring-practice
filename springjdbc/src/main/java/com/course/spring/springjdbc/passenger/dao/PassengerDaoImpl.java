package com.course.spring.springjdbc.passenger.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.course.spring.springjdbc.passenger.dao.rowmapper.PassengerRowMapper;
import com.course.spring.springjdbc.passenger.dto.Passenger;

@Component("passengerDao")
public class PassengerDaoImpl implements PassengerDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int create(Passenger passenger) {

		String sql = "insert into passenger values(?, ?, ?)";
		int result = jdbcTemplate.update(sql, passenger.getId(), passenger.getFirstName(), passenger.getLastName());
		return result;
	}

	@Override
	public int update(Passenger passenger) {
		String sql = "update passenger set firstname = ?, lastname = ? where id = ?";
		int result = jdbcTemplate.update(sql, passenger.getFirstName(), passenger.getLastName(), passenger.getId());
		return result;
	}

	@Override
	public int delete(int id) {
		String sql = "delete from passenger where id = ?";
		int result = jdbcTemplate.update(sql, id);
		return result;
	}

	@Override
	public Passenger read(int id) {
		PassengerRowMapper rowMapper = new PassengerRowMapper();

		String sql = "select * from passenger where id = ?";
		Passenger passenger = jdbcTemplate.queryForObject(sql, rowMapper, id);
		return passenger;
	}

	@Override
	public List<Passenger> read() {
		RowMapper<Passenger> rowMapper = (rs, rowNum) -> {
			Passenger passenger = new Passenger();
			
			passenger.setId(rs.getInt(1));
			passenger.setFirstName(rs.getString(2));
			passenger.setLastName(rs.getString(3));
			return passenger;
		};

		String sql = "select * from passenger";
		List<Passenger> passengers = jdbcTemplate.query(sql, rowMapper);
		return passengers;
	}

}
