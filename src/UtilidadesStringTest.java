import junit.framework.TestCase;

public class UtilidadesStringTest extends TestCase {

	public void testBuscarpalabra() {
		
		//caso null
		/*assertEquals(0,UtilidadesString.buscarpalabra(null, null));
		assertEquals(0,UtilidadesString.buscarpalabra(null, "descanso"));
		assertEquals(0,UtilidadesString.buscarpalabra("Ahora toca descanso", null));
	//caso facil
		assertEquals(1,UtilidadesString.buscarpalabra("Ahora toca descanso", "descanso"));
		assertEquals(2,UtilidadesString.buscarpalabra("Ahora toca descanso descanso", "descanso"));
		*/
		assertEquals(0,UtilidadesString.buscarpalabra("Ahora toca descansodescanso", "descanso"));
		assertEquals(0,UtilidadesString.buscarpalabra("Ahora toca Adescanso", "descanso"));
	}	

}
