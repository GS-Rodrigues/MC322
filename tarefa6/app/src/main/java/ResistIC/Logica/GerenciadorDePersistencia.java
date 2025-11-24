package ResistIC.Logica;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class GerenciadorDePersistencia {

    public static void salvarBatalha(Batalha b, String nomeBatalha) {
        try {

            //Escrevendo a extensão .xml ao final do nome dado pelo jogador
            if (!nomeBatalha.endsWith(".xml")) {
                nomeBatalha += ".xml";
            }

            File diretorio = new File("saves_batalhas");
            File arquivo = new File(diretorio, nomeBatalha);
            JAXBContext context = JAXBContext.newInstance(Batalha.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(b, arquivo);
        }

        catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public static Batalha carregarBatalha(String nomeBatalha) {
        try {
            if (!nomeBatalha.endsWith(".xml")) {
                nomeBatalha += ".xml";
            }

            File arquivo = new File("saves_batalhas", nomeBatalha);

            if (!arquivo.exists()) {
                System.out.println("Save não encontrado. Verifique se digitou corretamente");
                return null;
            }
            JAXBContext context = JAXBContext.newInstance(Batalha.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            return (Batalha) unmarshaller.unmarshal(arquivo);
        }

        catch (JAXBException e) {
            e.printStackTrace();
            return null;

        }
    }
    
}
