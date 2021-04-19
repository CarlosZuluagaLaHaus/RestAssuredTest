package utils.Enum;

public enum RecursoServicio {
    API_DUMMI("https://www.lahaus.com/"),
    ELIMINAR("delete/"),
    ACTUALIZAR("update/"),
    CONSULTAR("sabaneta?bedrooms=2"),
    GET("apartamentos/bogota/chico"),
    CREACION("api/v1/real_estate_search") ;
    private final String recurso;


    RecursoServicio(String recurso) {
        this.recurso = recurso;
    }

    public String getRecurso() {
        return recurso;
    }
    }