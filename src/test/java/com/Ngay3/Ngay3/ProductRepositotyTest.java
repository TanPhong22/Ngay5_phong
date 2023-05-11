package com.Ngay3.Ngay3;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.Ngay3.Ngay3.model.Product;
import com.Ngay3.Ngay3.model.ProductRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class ProductRepositotyTest {
	@Autowired
	private TestEntityManager testEntityManager;
	@Autowired
	private ProductRepository pdProductRepositotyTest;
	@Test
	public void TestCreate() {
		Product product= new Product();
		product.setName("phong2");
		product.setBrand("asdads");
		product.setPrice(100002);
		pdProductRepositotyTest.save(product);
		Product selectProduct= testEntityManager.find(Product.class, product.getId());
		assertThat(product.getName()).isEqualTo(selectProduct.getName());
	}

}
