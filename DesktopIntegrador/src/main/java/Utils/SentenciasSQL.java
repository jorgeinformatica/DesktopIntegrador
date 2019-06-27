/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

/**
 *
 * @author Yop
 */
public class SentenciasSQL {

    public static final String alarmasTM = "SELECT alarma.id, alarma.fecha_hora AS fecha,"
            + "(SELECT CONCAT(persona.name,' ', persona.apellido1,' ', persona.apellido2) AS dependiente"
            + " FROM x_dependiente_model AS dependientes, x_persona_model AS persona WHERE"
            + " alarma.id_dependiente = dependientes.id AND dependientes.persona_id = persona.id),"
            + " (SELECT CONCAT(persona.name,' ', persona.apellido1,' ', persona.apellido2) AS asistente"
            + " FROM x_asistente_model AS asistente, x_persona_model AS persona WHERE"
            + " alarma.id_asistente_atiende = asistente.id AND asistente.persona_id = persona.id)"
            + " FROM x_alarma_model AS alarma";

    public static final String avisosTM = " SELECT id, tipo AS aviso, name AS elemento,"
            + " fec_desde as inicio,fec_hasta as fin, periodicidad as descripcion,"
            + " CASE WHEN recibido isnull THEN 'no' WHEN recibido= false THEN 'no' ELSE 'si' END"
            + " as recibido FROM public.x_aviso_model WHERE id_dependiente=?";

    public static final String viviendasTM = "SELECT viv.id, "
            + "CONCAT(dir.tipovia,' ',dir.direccion,' ',dir.num,', ',ciu.name,' (',pro.name,')') AS direccion,"
            + " viv.name AS vivienda,CASE WHEN viv.habitual = false THEN 'no' ELSE 'si' END"
            + " as \"vivienda actual\", viv.modo_acceso AS acceso FROM x_vivienda_model AS viv,"
            + " x_direccion_model AS dir, x_ciudad_model AS ciu, x_provincia_model AS pro WHERE"
            + " viv.id_direccion = dir.id and dir.id_ciudad = ciu.id AND ciu.id_provincia = pro.id"
            + " AND viv.id_dependiente=? order by viv.habitual desc";

    public static final String allegadosTM = "SELECT con.id, con.disponibilidad,"
            + " CONCAT(per.name,' ', per.apellido1,' ', per.apellido2) AS allegado, per.telefono,"
            + " relacion, CASE WHEN fam.llaves = false THEN 'no' ELSE 'si' END AS \"tiene llaves\","
            + " fam.observaciones FROM x_familiar_model AS fam, x_persona_model AS per,"
            + " x_contactofamiliar_model AS con WHERE fam.persona_id = per.id AND"
            + " fam.id = con.familiar_id AND con.dependiente_id=? Order by con.prioridad desc, fam.llaves desc";

    public static final String recursosTM = "SELECT ofr.id, rec.name, rec.descripcion, ofr.telefono FROM"
            + " x_ofrecerrc_model AS ofr inner join x_recursocom_model rec ON"
            + " ofr.id_rc=rec.id WHERE ofr.id_ciudad=?";

    public static final String historialMedicoTM = "SELECT id, descripcion FROM public.x_histmedico_model WHERE name = 'medico' AND"
            + " id_dependiente=?";

    public static final String historialSocialTM = "SELECT id, descripcion FROM public.x_histmedico_model WHERE name = 'social' AND"
            + " id_dependiente=?";

    public static final String estadoTM = "SELECT id, fecha_hora AS \"Registro de llamada\", fecha_hora_inicio AS \"Registro de Suceso\","
            + " descripcion AS \"Descripción\"	FROM x_estado_model WHERE id_dependiente =? ";

    public static final String coordenadasTM = "SELECT id, fecha_hora, latitud, longitud FROM x_geolocaliz_model WHERE"
            + " id_dependiente=? ORDER BY fecha_hora DESC";

    public static final String personaDatos = " WHERE dni =?1";

    public static final String asistenteDatos = " WHERE persona_id = ?1";

    public static final String objectDatosId = " WHERE id = ?1";

    public static final String contactoDatos = " WHERE familiar_id=?1 AND dependiente_id=?2";
}
