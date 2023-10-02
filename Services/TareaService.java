package Services;

import Models.Tarea;
import Repositories.tareaRepository;

import java.util.List;

public class TareaService {

    private tareaRepository.TareaRepository tareaRepository;


    public TareaService(tareaRepository.TareaRepository tareaRepository) {
        this.tareaRepository = tareaRepository;
    }


    public Tarea obtenerTarea(Long id) {
        return tareaRepository.findById(id).orElse(null);
    }


    public List<Tarea> obtenerTodasLasTareas() {
        return tareaRepository.findAll();
    }


    public Tarea crearTarea(Tarea tarea) {
        return tareaRepository.save(tarea);
    }


    public Tarea actualizarTarea(Long id, Tarea tarea) {
        Tarea tareaActual = tareaRepository.findById(id).orElse(null);


        if (tareaActual != null) {
            tareaActual.setTítulo(tarea.getTítulo());
            tareaActual.setDescripción(tarea.getDescripción());
            tareaActual.setFechaDeVencimiento(tarea.getFechaDeVencimiento());


            return tareaRepository.save(tareaActual);
        } else {
            return null;
        }
    }


    public void eliminarTarea(Long id) {
        tareaRepository.deleteById(id);
    }

    public void deleteTarea(Long id) {
    }

    public Tarea updateTarea(Long id, Tarea tarea) {
    }

    public Tarea createTarea(Tarea tarea) {
    }

    public Tarea getTareaById(Long id) {
    }

    public List<Tarea> getAllTareas() {
    }
}
