package com.ak.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.HibernateTemplate;

import org.springframework.stereotype.Component;

import com.ak.dao.UserInfoDao;
import com.ak.pojo.Product;
import com.ak.pojo.UserInfo;

@Component
public class UserInfoDaoImpl implements UserInfoDao{
	
	private HibernateTemplate hTemplate;
	@Autowired
	public void sethTemplate(HibernateTemplate hTemplate) {
		this.hTemplate = hTemplate;
	}



	@Override
	public boolean checkUserCredential(UserInfo u) {
		
		boolean b = false;
		try 
		{
			b = hTemplate.execute(new HibernateCallback<Boolean>() 
			{
				@Override
				public Boolean doInHibernate(Session session) throws HibernateException 
				{
					Query q = session.createQuery("from UserInfo where "
							+ "username =:user and password = :pass");
					q.setParameter("user", u.getUsername());
					q.setParameter("pass", u.getPassword());
					List<Product>lst = q.list();
					if(lst.size()>0)
						return true;
					else
						return false;
				}
			}); 
			return b;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return false;
		}
		
	}
	@Override
	@Transactional
	public boolean addNewUser(UserInfo u) {
		try {
			
			hTemplate.save(u);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	

}
