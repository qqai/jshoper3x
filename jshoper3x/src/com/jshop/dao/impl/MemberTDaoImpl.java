package com.jshop.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.jshop.dao.MemberTDao;
import com.jshop.entity.MemberT;
import com.jshop.entity.TemplateT;

@Repository("memberTDao")
public class MemberTDaoImpl extends HibernateDaoSupport implements MemberTDao {
	private static final Logger log = LoggerFactory.getLogger(MemberTDaoImpl.class);
	@Override
	public void saveMemberT(MemberT mt) {
		log.debug("save MemberT");
		try {
			this.getHibernateTemplate().save(mt);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<MemberT> findAllMemberT(final int currentPage, final int lineSize) {
		log.debug("find all MemberT");
		try {
			List<MemberT> list = this.getHibernateTemplate().executeFind(new HibernateCallback() {

				String queryString = "from MemberT as mt order by createtime desc";

				public Object doInHibernate(Session session) throws HibernateException, SQLException {
					Query query = session.createQuery(queryString);
					query.setFirstResult((currentPage - 1) * lineSize);
					query.setMaxResults(lineSize);
					List list = query.list();
					return list;
				}
			});
			return list;
		} catch (RuntimeException re) {
			log.error("find all MemberT error", re);
			throw re;
		}
	}

	@Override
	public int countfindAllMemberT() {
		log.debug("count all MemberT");
		try {
			String queryString = "select count(*) from MemberT";
			List list = this.getHibernateTemplate().find(queryString);
			if (list.size() > 0) {
				Object o = list.get(0);
				long l = (Long) o;
				return (int) l;
			}
			return 0;
		} catch (RuntimeException re) {
			log.error("count all MemberT error", re);
			throw re;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<MemberT> findAllMemberT(final int currentPage,
			final int lineSize, final String creatorid) {
		log.debug("find all MemberT");
		try {
			List<MemberT> list = this.getHibernateTemplate().executeFind(new HibernateCallback() {

				String queryString = "from MemberT as mt where mt.creatorid=:creatorid order by createtime desc";

				public Object doInHibernate(Session session) throws HibernateException, SQLException {
					Query query = session.createQuery(queryString);
					query.setFirstResult((currentPage - 1) * lineSize);
					query.setMaxResults(lineSize);
					query.setParameter("creatorid", creatorid);
					List list = query.list();
					return list;
				}
			});
			return list;
		} catch (RuntimeException re) {
			log.error("find all MemberT error", re);
			throw re;
		}
	}

	@Override
	public int countfindAllMemberT(String creatorid) {
		log.debug("countfindAllMemberT");
		try {
			String queryString = "select count(*) from MemberT as mt where mt.creatorid=:creatorid";
			List list = this.getHibernateTemplate().findByNamedParam(queryString, "creatorid", creatorid);
			if (list.size() > 0) {
				Object o = list.get(0);
				long l = (Long) o;
				return (int) l;
			}
			return 0;
		} catch (RuntimeException re) {
			log.error("countfindAllMemberT error", re);
			throw re;
		}
	}

	@Override
	public void updateMemberT(MemberT mt) {
		log.debug("update MemberT");
		try {
			this.getHibernateTemplate().update(mt);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("update failed", re);
			throw re;
		}
	}
	

	@Override
	public MemberT findMemberTById(String id) {
		log.debug("findMemberTById");
		try {
			String queryString = "from MemberT as mt where mt.id=:id";
			List<MemberT> list = this.getHibernateTemplate().findByNamedParam(queryString, "id", id);
			if (list != null && list.size() > 0) {
				return list.get(0);
			}
			return null;
		} catch (RuntimeException re) {
			log.error("findMemberTById error", re);
			throw re;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public int delMemberT(final String[] strs) {
		log.debug("delMemberT");
		try {
			final String queryString = "delete from MemberT as mt where mt.id=:id";
			this.getHibernateTemplate().execute(new HibernateCallback() {

				public Object doInHibernate(Session session) throws HibernateException, SQLException {
					Query query = session.createQuery(queryString);
					int i = 0;
					for (String s : strs) {
						query.setParameter("id", s);
						i = query.executeUpdate();
					}
					if (strs.length == i) {
						return i;
					} else {
						return 0;
					}
				}
			});
		} catch (RuntimeException re) {
			log.error("delMemberT", re);
			throw re;
		}
		return 0;
	}

	@Override
	public List<MemberT> findMemberTByloginname(String loginname) {
		log.debug("findMemberTByloginname");
		try {
			String queryString = "from MemberT as mt where mt.loginname=:loginname";
			List<MemberT> list = this.getHibernateTemplate().findByNamedParam(queryString, "loginname", loginname);
			return list;
		} catch (RuntimeException re) {
			log.error("findMemberTByloginname error", re);
			throw re;
		}
	}

}
