package com.univ.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.univ.dao.UserInfoDao;
import com.univ.pojo.UserInfo;

@Component
public class UserInfoDaoImpl implements UserInfoDao{

	private HibernateTemplate hTemplate;
		
	@Autowired
	public void sethTemplate(HibernateTemplate hTemplate) {
		this.hTemplate = hTemplate;
	}

	@Override
	public UserInfo checkUserCredential(UserInfo u) {
		
		UserInfo user=null;
		try {
			//UserInfo user = hTemplate.get(UserInfo.class, u.getUsername());
			user =  hTemplate.execute(new HibernateCallback<UserInfo>() 
			{
				@Override
				public UserInfo doInHibernate(Session session) throws HibernateException {
					Query q = session.createQuery("from UserInfo where"
					+ " username =:user and password =:pass");
					q.setParameter("user", u.getUsername());
					q.setParameter("pass", u.getPassword());
					
					List<UserInfo>lst = q.getResultList();
					if(lst.size()>0)
						return lst.get(0);
					else
						return null;
				}
			});
			
		} catch (Exception e) {
			
			e.printStackTrace();
			return null;
		}
		return user;
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
