package ejercicio5;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author p.costa          (Pablo Costa Oubiña)
 * @author pablo.aragunde   (Pablo Aragunde Canabal)
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ejercicio5.TurnoTest.class, ejercicio5.PersonaTest.class, ejercicio5.TrabajadorTest.class, ejercicio5.ClienteTest.class, ejercicio5.ReponedorTest.class, ejercicio5.DependienteTest.class})
public class Ejercicio5Suite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
