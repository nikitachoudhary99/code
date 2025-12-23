package com.univ.dao;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.orm.hibernate5.HibernateTemplate;
import com.univ.entities.Fruit;

public class FruitDao {

    private HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Transactional
    public int insert(Fruit fruit) {
        return (Integer) hibernateTemplate.save(fruit);
    }

    public Fruit getFruit(int id) {
        return hibernateTemplate.get(Fruit.class, id);
    }

    public List<Fruit> getAllFruits() {
        return hibernateTemplate.loadAll(Fruit.class);
    }

    @Transactional
    public void deleteFruit(int id) {
        Fruit f = hibernateTemplate.get(Fruit.class, id);
        hibernateTemplate.delete(f);
    }

    @Transactional
    public void updateFruit(Fruit fruit) {
        hibernateTemplate.update(fruit);
    }
}
