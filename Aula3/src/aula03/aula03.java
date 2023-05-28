/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula03;
    public class aula03 {
        public static void main(String[] args) {
            Caneta c1 = new Caneta();
            c1.modelo = "BIC cristal";
            c1.cor = "Azul";
            //c1.ponta = 0.5f;
            c1.carga = 80;
            c1.tampada = true;
            c1.status();
        }
}
