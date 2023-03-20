package fr.formation.formationdevops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FormationDevopsApplicationTests {
	@Test
	void contextLoads() {

		Calculatrice calc = new Calculatrice();

		Assertions.assertEquals(11, calc.additionner(5, 6));
		Assertions.assertEquals(1, calc.soustraire(6, 5));

		// Dans un test, on fait des assertions
		Assertions.assertTrue(true);

		Assertions.assertEquals(10, 5 + 5);
	}
}
