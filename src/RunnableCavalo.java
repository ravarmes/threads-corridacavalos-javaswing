
import javax.swing.JButton;

public class RunnableCavalo implements Runnable {

    public JButton jButton;
    public String nome;
    public int prioridade = Thread.MIN_PRIORITY;

    // Implementar classificação de chegada dos cavalos.
    public RunnableCavalo(JButton v1, String v2) {
        jButton = v1;
        nome = v2;
    }

    @Override
    public void run() {
        Thread.currentThread().setPriority(prioridade);
        System.out.println(Thread.currentThread().getName() + " - Prioridade: " + Thread.currentThread().getPriority());

        // Implementar a movimentação do cavalo
        // Somar de 1 em 1 até 600 pontos ao bound.x
        // Na posição 500 do bound.x o cavalo passa pela linha de chegada
        // jButton.setBounds(jButton.getBounds().x + 1, jButton.getBounds().y, jButton.getBounds().width, jButton.getBounds().height);
        // Para melhor visualizar a movimentação dos cavalos, utilize sleep. Ainda sobre o sleep, trabalhe com um valor aleatório até 50. Assim, em cada execução, um cavalo diferente vencerá.
        // Assim que os cavalos foram chegando imprima o nome do cavalo utilizando System.out.println
        for (int i = 1; i <= 600; i++) {

            jButton.setBounds(jButton.getBounds().x + 1, jButton.getBounds().y, jButton.getBounds().width, jButton.getBounds().height);

            if (jButton.getBounds().x == 500) {
                System.out.println(Thread.currentThread().getName() + " - Chegou!!!");
            }            
            
            sleep2();
            
        }
    }
    
    /*
        Este método tem a finalidade de deixar a corrida de cavalos mais lenta.
        A estratégia para isso é utilizar o método Thread.sleep
    */
    public void sleep1() {
        try {
            //Thread.sleep(new Random().nextInt(50));
            Thread.sleep(50); //Espera cronometrada
        } catch (InterruptedException ex) {

        }
    }

    /*
        Este método tem a finalidade de deixar a corrida de cavalos mais lenta.
        A estratégia para isso é a realização de um processamento (for e ifs)
    */
    public void sleep2() {
        int l = 0;
        for (int j = 1; j <= 4000000; j++) {
            if (l % 3 == 0) {
                l = l + 2;
            }
            if (l % 2 == 0) {
                l = l + 1;
            }
            l = l + 1;
        }
    }
    
}
