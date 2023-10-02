package Services;

import Models.Comentario;
import Repositories.tareaRepository;

import java.util.List;

public class ComentarioService {


    private Repositories.comentarioRepository.ComentarioRepository comentarioRepository;
    private tareaRepository.TareaRepository tareaRepository;


    public ComentarioService(Repositories.comentarioRepository.ComentarioRepository comentarioRepository, tareaRespository.TareaRepository tareaRepository) {
        this.comentarioRepository = comentarioRepository;
        this.tareaRepository = tareaRepository;
    }


    public Comentario obtenerComentario(Long id) {
        return comentarioRepository.findById(id).orElse(null);
    }


    public List<Comentario> obtenerComentariosDeTarea(Long idTarea) {
        return comentarioRepository.findByTarea(tareaRepository.findById(idTarea).orElse(null));
    }


    public Comentario crearComentario(Comentario comentario) {
        return comentarioRepository.save(comentario);
    }


    public Comentario actualizarComentario(Long id, Comentario comentario) {
        Comentario comentarioActual = comentarioRepository.findById(id).orElse(null);


        if (comentarioActual != null) {
            comentarioActual.setTexto(comentario.getTexto());
            comentarioActual.setFechaDeCreación(comentario.getFechaDeCreación());


            return comentarioRepository.save(comentarioActual);
        } else {
            return null;
        }
    }


    public void eliminarComentario(Long id) {
        comentarioRepository.deleteById(id);
    }

    public Comentario createComentario(Comentario comentario) {
    }

    public Comentario getComentarioById(Long id) {
    }

    public Comentario updateComentario(Long id, Comentario comentario) {
    }

    public void deleteComentario(Long id) {
    }

    public List<Comentario> getAllComentarios() {
    }
}

