import junit.framework.TestCase;

public class ParticipanteTest extends TestCase {
	public void testConstructorVacio() {
		Participante p= new Participante();
		assertEquals("", p.getNombre());
		assertEquals("", p.getUsusarioGit());
		assertEquals("", p.getEmail());
		assertEquals("https://github.com/",p.getLinkGitHub());
		assertEquals("", p.isTrabajador());
	}
	public void testConstructor() {
	
		Participante p1 = new Participante("ander", "anderuraga");
		p1.setEmail("auraga@ipartek.com");
		assertEquals("ander", p1.getNombre());
		assertEquals("anderuraga", p1.getUsusarioGit());
		
		
	}

}
