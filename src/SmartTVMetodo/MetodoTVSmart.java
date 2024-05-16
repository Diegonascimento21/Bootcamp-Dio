package SmartTVMetodo;

public class MetodoTVSmart {

	public static void main(String[] args) {
		
		SmartTvApp SmartTvApp = new SmartTvApp();
		
		System.out.println("TV ligada ? " + SmartTvApp.ligada);
		System.out.println("Canal atual : " + SmartTvApp.canal);
		System.out.println("Volume da TV: " + SmartTvApp.volume);
		
		SmartTvApp.ligar();
		System.out.println("TV ligada ? " + SmartTvApp.ligada);

		SmartTvApp.desligar();
		System.out.println("TV ligada ? " + SmartTvApp.ligada);

		SmartTvApp.aumentarVolume();
		SmartTvApp.aumentarVolume();
		SmartTvApp.aumentarVolume();
		System.out.println("Volume da TV: " + SmartTvApp.volume);
		
		SmartTvApp.diminuirVolume();
		System.out.println("Volume da TV: " + SmartTvApp.volume);

		SmartTvApp.aumentarCanal();
		SmartTvApp.aumentarCanal();
		System.out.println("Canal da TV: " + SmartTvApp.canal);
		
		SmartTvApp.mudarCanal(17);
		System.out.println("Canal da TV: " + SmartTvApp.canal);


	}

}
