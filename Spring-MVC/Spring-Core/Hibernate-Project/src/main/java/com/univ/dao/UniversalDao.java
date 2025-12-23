package com.univ.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.univ.pojo.Universal;

public class UniversalDao {
	private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	@Transactional
	public int insert(Universal universal)
	{
		Integer I=(Integer) hibernateTemplate.save(universal);
		return I;
	}
	@Transactional
	public Universal getUniversal(int universalId)
	{
		return this.hibernateTemplate.get(Universal.class,universalId);
	}
	@Transactional
	public List<Universal>getAllUniversal()
	{
		List<Universal> universal=this.hibernateTemplate.loadAll(Universal.class);
		return universal;
	}
	@Transactional
	public void deleteUniversal(int universalId)
	{
		Universal universal=this.hibernateTemplate.get(Universal.class, Universal.class);
		this.hibernateTemplate.delete(universal);
		
	}
	@Transactional
	public void updateUniversal(Universal universal)
	{
		this.hibernateTemplate.update(universal);
	}
	
}
