package com.choucair.taks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class Create implements Task {

        private String primer_nombre;
        private String apellido;
        private String vacante;
        private String correo_electronico;
        private String contacto;
        private Target campoPrimerNombre;
        private Target campoApellido;
        private Target campoVacante;
        private Target campoCorreo_electronico;
        private Target campoContacto;
        private Target btnAdd;


        public Create(String primer_nombre, String apellido, String vacante, String correo_electronico, String contacto,Target campoPrimerNombre, Target campoApellido, Target campoVacante, Target campoCorreo_electronico, Target campoContacto, Target btnAdd) {
            this.primer_nombre = primer_nombre;
            this.apellido = apellido;
            this.vacante = vacante;
            this.correo_electronico = correo_electronico;
            this.contacto = contacto;
            this.btnAdd = btnAdd;
            this.campoPrimerNombre = campoPrimerNombre;
            this.campoApellido = campoApellido;
            this.campoCorreo_electronico = campoCorreo_electronico;
            this.campoContacto = campoContacto;
            this.campoVacante = campoVacante;
        }

        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Enter.theValue(primer_nombre).into(campoPrimerNombre),
                    Enter.theValue(apellido).into(campoApellido),
                    Enter.theValue(vacante).into(campoVacante),
                    Enter.theValue(correo_electronico).into(campoCorreo_electronico),
                    Enter.theValue(contacto).into(campoContacto),
                    Click.on(btnAdd)
            );
        }

        public static Create in (String primer_nombre, String apellido, String vacante, String correo_electronico, String contacto,Target campoPrimerNombre, Target campoApellido, Target campoVacante, Target campoCorreo_electronico, Target campoContacto, Target btnAdd){
            return Tasks.instrumented(Create.class, primer_nombre, apellido, vacante, correo_electronico, contacto, campoPrimerNombre, campoApellido, campoCorreo_electronico, campoContacto);
        }

    }

