import java.util.Scanner;
public class CensoDemografico {
    public static void main(String[] args){
        //Scanner para inputar de dados
        Scanner scan = new Scanner(System.in);
        //Declaracao das variaveis 
        int i, genero, igr=0, idade=0;
	double outros=0; 
	float altura, midh=0, maml=0, migp=0, mediaIDespec, contMidh=0, contMaml=0, contGP=0, contOutros=0, contIdade=0, contIDespec=0;
		
        //Estrutura de repeticao For
        for (i=0; i < 1000; i++) {
	    //Entrada da variavel de genero
            System.out.println("Digite '0' se for do genero feminino, '1' para masculino e '2' para outros: ");
            genero = scan.nextInt();
	    contGP++;
            //Entrada da variavel de idade
            System.out.println("Qual e a sua idade? ");
	    idade = scan.nextInt();
            contIdade++;
	    //Uma condicional para determinar a quantiadade de pessoas na faixa etaria em especifico
	    if (idade >= 18 && idade <= 35) {
            contIDespec++;
            }
            //Realizacao da soma da variável de idade 
            igr = igr + idade;
	    //Entrada da variavel de altura
            System.out.println("Qual e a sua altura? ");
	    altura = scan.nextFloat();
		
	    //Condicional para identificar os generos e separar as informacoes 
            if ( genero==1) {
	    midh = midh + idade;
	    contMidh++;
		    }
	    else if (genero==0) {
	    maml = maml + altura;
	    contMaml++;
		    }
	    else if (genero==2) {
	    outros = outros +0;
	    contOutros++;        
                    }
        }


        //Calculo das medias de idade do grupo, altura , idade , total de pessoas identificadas como "Outros" e percentual de pessoas com a idade entre a faixa etaria especifica
        migp = igr / contIdade;
        maml = maml / contMaml;
        midh = midh / contMidh;
        outros = contOutros + 0;
        mediaIDespec = ( contIDespec / contGP ) * 100;
        //Exibicao das informacoes calculadas acima
        System.out.printf("Media idade do grupo: %f\n", + migp);
        System.out.printf("Media altura das mulheres: %f\n", + maml);
        System.out.printf("Media idade dos homens: %f\n", + midh);
        System.out.printf("Pessoas identificadas como 'outros': %f\n", + outros);
        System.out.printf("Percentual de pessoas com idade entre 18 e 35: " + mediaIDespec + "%%");
    }
	
}