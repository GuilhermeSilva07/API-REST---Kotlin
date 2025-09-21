package br.com.alura.forum.service

import br.com.alura.forum.model.Usuario
import org.springframework.stereotype.Service
import java.util.*

@Service
class UsuarioService(var usuarios: List<Usuario>) {


    init {
        val  usuario = Usuario(
                id = 1,
                nome = "Guilherme",
                email = "Guilherme@gmail.com"
        )
        usuarios = Arrays.asList(usuario)
    }

    fun buscarPorId(id: Long): Usuario{
        println("Buscando usuario com id=$id na lista $usuarios")
        return usuarios.stream().filter({
            c -> c.id == id
        }).findFirst().get()
    }
}
