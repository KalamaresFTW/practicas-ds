package ejercicio2;

/**
 * @author p.costa (Pablo Costa Oubiña)
 * @author pablo.aragunde (Pablo Aragunde Canabal)
 */
public class UtilidadesFecha {

    /**
     * Indica si un año es bisiesto o no. Un año es bisiesto si es divisible
     * entre 4, a no ser que que sea divisible entre 100, en cuyo caso debería
     * ser divisible entre 400 para ser bisiesto (1900 no es bisiesto pero el
     * año 2000 sí)
     *
     * @param anho
     * @return boolean si es bisiesto
     */
    public static boolean esBisiesto(int anho) {
        return anho % 4 == 0 && (!(anho % 100 == 0) || anho % 400 == 0);
    }

    /**
     * Indica el número de días de un mes. Como el número de días de febrero
     * depende del año habrá que pasarle también el año.
     *
     * @param mes
     * @param anho
     * @return
     * @throws IllegalArgumentException
     */
    public static int diasMes(int mes, int anho) throws IllegalArgumentException {
        switch (mes) {
            //meses de 31 días
            case (1):
            case (3):
            case (5):
            case (7):
            case (8):
            case (10):
            case (12):
                return 31;
            //meses de 30 días
            case (4):
            case (6):
            case (9):
            case (11):
                return 30;
            //febrero
            case (2):
                return esBisiesto(anho) ? 29 : 28;
            //meses erróneos, e.g.: 13, -4.
            default:
                throw new IllegalArgumentException("El mes " + mes + " no existe");
        }
    }

    /**
     * El formato de fecha ISO es un formato estándar que representa las fechas
     * situando primero el año, luego el mes y por último el día: AAAA/MM/DD En
     * dicho formato, por ejemplo, el 28 de julio de 2006 se representará como
     * 2006-07-28. El método convertirISO convierte una fecha en formato
     * habitual de DD de MM de AAAA a su representación en formato ISO. Para
     * simplificar las cosas podemos suponer que el formato habitual que le va-
     * mos a pasar es correcto, aunque la fecha puede ser incorrecta, por ejem-
     * plo, podemos pasarle el 31 de Febrero. 21 de Septiembre de 2002
     *
     * @param textoFecha fecha en formato "DD de [mes] de AAAA"
     * @return String fecha en formato ISO
     * @throws IllegalArgumentException si el mes indicado no existe
     */
    public static String convertirISO(String textoFecha) throws IllegalArgumentException {
        if (textoFecha != null) {
            String convertedString;
            String mes = new String();
            String[] split = textoFecha.split(" de ");
            switch (split[1].toLowerCase()) {
                case ("enero"):
                    mes = "01";
                    break;
                case ("febrero"):
                    mes = "02";
                    break;
                case ("marzo"):
                    mes = "03";
                    break;
                case ("abril"):
                    mes = "04";
                    break;
                case ("mayo"):
                    mes = "05";
                    break;
                case ("junio"):
                    mes = "06";
                    break;
                case ("julio"):
                    mes = "07";
                    break;
                case ("agosto"):
                    mes = "08";
                    break;
                case ("septiembre"):
                    mes = "09";
                    break;
                case ("octubre"):
                    mes = "10";
                    break;
                case ("noviembre"):
                    mes = "11";
                    break;
                case ("diciembre"):
                    mes = "12";
                    break;
                default:
                    throw new IllegalArgumentException("El mes " + split[1]
                            + " no existe");
            }
            convertedString = split[2] + "/" + mes + "/" + split[0];
            return convertedString;
        } else {
            throw new IllegalArgumentException("EL argumento proporcionado es"
                    + " null");
        }
    }

    /**
     * Dado un String que representa una fecha en formato ISO comprueba que es
     * una fecha correcta. Por fecha correcta entendemos que no existan letras
     * ni caracteres extraños en la fecha, que tenga la longitud adecuada y que
     * la fecha representada sea válida, es decir, que se tenga en cuenta el
     * número de días en cada mes.
     *
     * @param fechaISO la fecha en formato ISO
     * @return boolean true si la fecha está en formato ISO, false en caso
     * contrario
     */
    public static boolean comprobarFechaISO(String fechaISO) {
        if (fechaISO.matches("[0-9]{4}\\/[01][0-9]\\/[0-3][0-9]")) {
            String[] split = fechaISO.split("/");
            int anho = Integer.parseInt(split[0]);
            int mes = Integer.parseInt(split[1]);
            int dia = Integer.parseInt(split[2]);
            return (dia > 0 && dia <= diasMes(mes, anho));
        } else {
            return false;
        }

    }
}
