class Automovil {

   private String marca;
   private String modelo;
   private String color;
   float velocidadMaxima;

   public Automovil(String marca, String modelo, String color, String velocidadMaxima) {
      this.marca = marca;
      this.modelo = modelo;
      this.color = color;
      this.velocidadMaxima = velocidadMaxima;
   }

   public String getMarca() {
      return marca;
   }

   public void setMarca(String marca) {
      this.marca = marca;
   }

   public String getModelo() {
      return modelo;
   }

   public void setModelo(String modelo) {
      this.modelo = modelo;
   }

   public String getColor() {
      return color;
   }

   public void setColor(String color) {
      this.color = color;
   }

   public float getVelocidadMaxima() {
      return velocidadMaxima;
   }

   public void setVelocidadMaxima(float velocidadMaxima) {
      this.velocidadMaxima = velocidadMaxima;
   }

}