package principal.cruddisciplina.controle;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import principal.cruddisciplina.dao.DisciplinaDAO;
import principal.cruddisciplina.dominio.Disciplina;

import java.util.List;

@Controller
public class DisciplinaControle {
	@GetMapping("/disciplinas")
	public String disciplinasTabela(Model modelo) {
		DisciplinaDAO dao = new DisciplinaDAO();
		List<Disciplina> lista = dao.todos();
		modelo.addAttribute("lista",lista);
		return "disciplinas"; 
	}
}