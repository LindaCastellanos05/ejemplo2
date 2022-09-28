
package ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WSColegioIntecap", targetNamespace = "http://services.soap.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WSColegioIntecap {


    /**
     * 
     * @param nombre
     * @param contraseña
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "login", targetNamespace = "http://services.soap.com/", className = "ws.Login")
    @ResponseWrapper(localName = "loginResponse", targetNamespace = "http://services.soap.com/", className = "ws.LoginResponse")
    @Action(input = "http://services.soap.com/WSColegioIntecap/loginRequest", output = "http://services.soap.com/WSColegioIntecap/loginResponse")
    public String login(
        @WebParam(name = "nombre", targetNamespace = "")
        String nombre,
        @WebParam(name = "contrase\u00f1a", targetNamespace = "")
        String contraseña);

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://services.soap.com/", className = "ws.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://services.soap.com/", className = "ws.HelloResponse")
    @Action(input = "http://services.soap.com/WSColegioIntecap/helloRequest", output = "http://services.soap.com/WSColegioIntecap/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param alumno
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "actualizarAlumno2", targetNamespace = "http://services.soap.com/", className = "ws.ActualizarAlumno2")
    @ResponseWrapper(localName = "actualizarAlumno2Response", targetNamespace = "http://services.soap.com/", className = "ws.ActualizarAlumno2Response")
    @Action(input = "http://services.soap.com/WSColegioIntecap/actualizarAlumno2Request", output = "http://services.soap.com/WSColegioIntecap/actualizarAlumno2Response")
    public String actualizarAlumno2(
        @WebParam(name = "alumno", targetNamespace = "")
        ModeloAlumno alumno);

    /**
     * 
     * @return
     *     returns java.util.List<ws.ModeloAlumno>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "todosalumnos", targetNamespace = "http://services.soap.com/", className = "ws.Todosalumnos")
    @ResponseWrapper(localName = "todosalumnosResponse", targetNamespace = "http://services.soap.com/", className = "ws.TodosalumnosResponse")
    @Action(input = "http://services.soap.com/WSColegioIntecap/todosalumnosRequest", output = "http://services.soap.com/WSColegioIntecap/todosalumnosResponse")
    public List<ModeloAlumno> todosalumnos();

    /**
     * 
     * @param id
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eliminarGrado", targetNamespace = "http://services.soap.com/", className = "ws.EliminarGrado")
    @ResponseWrapper(localName = "eliminarGradoResponse", targetNamespace = "http://services.soap.com/", className = "ws.EliminarGradoResponse")
    @Action(input = "http://services.soap.com/WSColegioIntecap/eliminarGradoRequest", output = "http://services.soap.com/WSColegioIntecap/eliminarGradoResponse")
    public String eliminarGrado(
        @WebParam(name = "id", targetNamespace = "")
        int id);

    /**
     * 
     * @param grado
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "actualizarGrado", targetNamespace = "http://services.soap.com/", className = "ws.ActualizarGrado")
    @ResponseWrapper(localName = "actualizarGradoResponse", targetNamespace = "http://services.soap.com/", className = "ws.ActualizarGradoResponse")
    @Action(input = "http://services.soap.com/WSColegioIntecap/actualizarGradoRequest", output = "http://services.soap.com/WSColegioIntecap/actualizarGradoResponse")
    public String actualizarGrado(
        @WebParam(name = "grado", targetNamespace = "")
        ModeloGrado grado);

    /**
     * 
     * @return
     *     returns java.util.List<ws.ModeloNota>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "todosnotas", targetNamespace = "http://services.soap.com/", className = "ws.Todosnotas")
    @ResponseWrapper(localName = "todosnotasResponse", targetNamespace = "http://services.soap.com/", className = "ws.TodosnotasResponse")
    @Action(input = "http://services.soap.com/WSColegioIntecap/todosnotasRequest", output = "http://services.soap.com/WSColegioIntecap/todosnotasResponse")
    public List<ModeloNota> todosnotas();

    /**
     * 
     * @return
     *     returns java.util.List<ws.ModeloGrado>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "todosgrados", targetNamespace = "http://services.soap.com/", className = "ws.Todosgrados")
    @ResponseWrapper(localName = "todosgradosResponse", targetNamespace = "http://services.soap.com/", className = "ws.TodosgradosResponse")
    @Action(input = "http://services.soap.com/WSColegioIntecap/todosgradosRequest", output = "http://services.soap.com/WSColegioIntecap/todosgradosResponse")
    public List<ModeloGrado> todosgrados();

    /**
     * 
     * @param alumno
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "crearAlumno", targetNamespace = "http://services.soap.com/", className = "ws.CrearAlumno")
    @ResponseWrapper(localName = "crearAlumnoResponse", targetNamespace = "http://services.soap.com/", className = "ws.CrearAlumnoResponse")
    @Action(input = "http://services.soap.com/WSColegioIntecap/crearAlumnoRequest", output = "http://services.soap.com/WSColegioIntecap/crearAlumnoResponse")
    public String crearAlumno(
        @WebParam(name = "alumno", targetNamespace = "")
        ModeloAlumno alumno);

    /**
     * 
     * @param id
     * @return
     *     returns java.util.List<ws.ModeloAlumno>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscarAlumno", targetNamespace = "http://services.soap.com/", className = "ws.BuscarAlumno")
    @ResponseWrapper(localName = "buscarAlumnoResponse", targetNamespace = "http://services.soap.com/", className = "ws.BuscarAlumnoResponse")
    @Action(input = "http://services.soap.com/WSColegioIntecap/buscarAlumnoRequest", output = "http://services.soap.com/WSColegioIntecap/buscarAlumnoResponse")
    public List<ModeloAlumno> buscarAlumno(
        @WebParam(name = "id", targetNamespace = "")
        int id);

    /**
     * 
     * @param id
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eliminarAlumno", targetNamespace = "http://services.soap.com/", className = "ws.EliminarAlumno")
    @ResponseWrapper(localName = "eliminarAlumnoResponse", targetNamespace = "http://services.soap.com/", className = "ws.EliminarAlumnoResponse")
    @Action(input = "http://services.soap.com/WSColegioIntecap/eliminarAlumnoRequest", output = "http://services.soap.com/WSColegioIntecap/eliminarAlumnoResponse")
    public String eliminarAlumno(
        @WebParam(name = "id", targetNamespace = "")
        int id);

    /**
     * 
     * @param idAlumno
     * @param idGrado
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eliminarNota", targetNamespace = "http://services.soap.com/", className = "ws.EliminarNota")
    @ResponseWrapper(localName = "eliminarNotaResponse", targetNamespace = "http://services.soap.com/", className = "ws.EliminarNotaResponse")
    @Action(input = "http://services.soap.com/WSColegioIntecap/eliminarNotaRequest", output = "http://services.soap.com/WSColegioIntecap/eliminarNotaResponse")
    public String eliminarNota(
        @WebParam(name = "id_alumno", targetNamespace = "")
        int idAlumno,
        @WebParam(name = "id_grado", targetNamespace = "")
        int idGrado);

    /**
     * 
     * @param nota
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "actualizarNota", targetNamespace = "http://services.soap.com/", className = "ws.ActualizarNota")
    @ResponseWrapper(localName = "actualizarNotaResponse", targetNamespace = "http://services.soap.com/", className = "ws.ActualizarNotaResponse")
    @Action(input = "http://services.soap.com/WSColegioIntecap/actualizarNotaRequest", output = "http://services.soap.com/WSColegioIntecap/actualizarNotaResponse")
    public String actualizarNota(
        @WebParam(name = "nota", targetNamespace = "")
        ModeloNota nota);

    /**
     * 
     * @param grado
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "crearGrado", targetNamespace = "http://services.soap.com/", className = "ws.CrearGrado")
    @ResponseWrapper(localName = "crearGradoResponse", targetNamespace = "http://services.soap.com/", className = "ws.CrearGradoResponse")
    @Action(input = "http://services.soap.com/WSColegioIntecap/crearGradoRequest", output = "http://services.soap.com/WSColegioIntecap/crearGradoResponse")
    public String crearGrado(
        @WebParam(name = "grado", targetNamespace = "")
        ModeloGrado grado);

    /**
     * 
     * @param idgrado
     * @return
     *     returns java.util.List<ws.ModeloGrado>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscarGrado", targetNamespace = "http://services.soap.com/", className = "ws.BuscarGrado")
    @ResponseWrapper(localName = "buscarGradoResponse", targetNamespace = "http://services.soap.com/", className = "ws.BuscarGradoResponse")
    @Action(input = "http://services.soap.com/WSColegioIntecap/buscarGradoRequest", output = "http://services.soap.com/WSColegioIntecap/buscarGradoResponse")
    public List<ModeloGrado> buscarGrado(
        @WebParam(name = "idgrado", targetNamespace = "")
        int idgrado);

    /**
     * 
     * @param alumno
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "actualizarAlumno", targetNamespace = "http://services.soap.com/", className = "ws.ActualizarAlumno")
    @ResponseWrapper(localName = "actualizarAlumnoResponse", targetNamespace = "http://services.soap.com/", className = "ws.ActualizarAlumnoResponse")
    @Action(input = "http://services.soap.com/WSColegioIntecap/actualizarAlumnoRequest", output = "http://services.soap.com/WSColegioIntecap/actualizarAlumnoResponse")
    public String actualizarAlumno(
        @WebParam(name = "alumno", targetNamespace = "")
        ModeloAlumno alumno);

    /**
     * 
     * @param idAlumno
     * @param idGrado
     * @return
     *     returns java.util.List<ws.ModeloNota>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscarNota", targetNamespace = "http://services.soap.com/", className = "ws.BuscarNota")
    @ResponseWrapper(localName = "buscarNotaResponse", targetNamespace = "http://services.soap.com/", className = "ws.BuscarNotaResponse")
    @Action(input = "http://services.soap.com/WSColegioIntecap/buscarNotaRequest", output = "http://services.soap.com/WSColegioIntecap/buscarNotaResponse")
    public List<ModeloNota> buscarNota(
        @WebParam(name = "id_alumno", targetNamespace = "")
        int idAlumno,
        @WebParam(name = "id_grado", targetNamespace = "")
        int idGrado);

    /**
     * 
     * @param nota
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "creaNota", targetNamespace = "http://services.soap.com/", className = "ws.CreaNota")
    @ResponseWrapper(localName = "creaNotaResponse", targetNamespace = "http://services.soap.com/", className = "ws.CreaNotaResponse")
    @Action(input = "http://services.soap.com/WSColegioIntecap/creaNotaRequest", output = "http://services.soap.com/WSColegioIntecap/creaNotaResponse")
    public String creaNota(
        @WebParam(name = "nota", targetNamespace = "")
        ModeloNota nota);

}
