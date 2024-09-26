package com.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AddCandidatesPage {


    public static final Target Add_candidate = Target.the("Agregar candidato").locatedBy("//a[@class='oxd-main-menu-item'])[5]");
    public static final Target first_name = Target.the("Agregar primer Nombre").locatedBy("name:firstName");
    public static final Target last_Name = Target.the("Agregar Apellidos").locatedBy("name:lastNamee");
    public static final Target Input_vacante = Target.the("Agregar Vacante").locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div/div[2]/div/div/div[1]");
    public static final Target Email = Target.the("Agregar Email").locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input");
    public static final Target Contact = Target.the("Agregar Contact").locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div/div[2]/input");
    public static final Target Keywords = Target.the("Agregar comentarios").locatedBy("<input data-v-1f99f73c=\"\" class=\"oxd-input oxd-input--active\" placeholder=\"Enter comma seperated words...\">");
    public static final Target Notes = Target.the("Agregar Notas").locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[6]/div/div/div/div[2]/textarea");
    public static final Target BTN_Save = Target.the("Boron guardar").locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[8]/button[2]");


}
