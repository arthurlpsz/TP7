package br.edu.fatecpg.veiculo.view;
import br.edu.fatecpg.veiculo.model.Bicicleta;
import br.edu.fatecpg.veiculo.model.Carro;
public class Main {

	public static void main(String[] args) {
		Carro carro = new Carro("Renault", "Sandero");
		Bicicleta bicicleta = new Bicicleta("Caloi", "Rosa");
	carro.mover();
	bicicleta.mover();
	}

}
