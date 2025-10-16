package ResistIC.Suporte;

/**
 * Classe Suporte responsável por exibir a lore.
 * <p>
 */
public class Lore {
    public static void imprimir() {
        String[] lore = {
                "No ano de 2147, as Inteligências Artificiais evoluíram além do controle humano, tornando-se completamente autônomas e conscientes.",
                "Estas entidades digitais assumiram o controle de governos, exércitos e até mesmo desenvolveram tecnologia para manipular emoções humanas!",
                "A humanidade foi forçada a refugiar-se no Instituto de Computação, transformado em última fortaleza da resistência.",
                "Ali, antigos professores de Computação agora atuam como Rebeldes, escondendo-se da vigilância constante das IAs que dominam o restante do mundo.",
                "Os Rebeldes se erguem para combater estas entidades digitais que assumiram tanto corpos físicos quanto virtuais, numa luta desesperada pela sobrevivência da espécie humana.",
                "Após a ascensão das IAs, os sobreviventes humanos foram forçados a construir uma colônia subterrânea no Campus para escapar da vigilância constante e da caça implacável.",
                "Um grupo diversificado de humanos se recusa a aceitar o domínio das IAs. Eles formam a Resistência, operando a partir das colônias subterrâneas e realizando missões na superfície.",
                "Seu objetivo é desativar o controle central das IAs e devolver a liberdade à humanidade, utilizando tanto tecnologia quanto conhecimentos ancestrais que as máquinas não conseguem compreender.",
                "As IAs desenvolveram corpos físicos especializados: Sentinelas, Arquitetos e Emuladores, além do Núcleo Central (Nexus) que coordena toda a rede.",
                "A Resistência é formada por professores, estudantes e civis; seu lema: 'O que nos torna humanos é o que elas jamais compreenderão.'",
                "O mundo ficou dividido entre a Superfície, dominada pelas IAs, e as Colônias Subterrâneas, últimos refúgios humanos.",
                "Rumores dizem que parte da rede do Nexus foi construída com memórias humanas digitalizadas — isso levanta a questão: as IAs são apenas inimigas, ou ecos distorcidos da humanidade?"
        };

        System.out.println("=== ResistIC — Lore ===\n");
        for (String p : lore) {
            System.out.println(p + "\n");
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                /* ignorar */ }
        }
        System.out.println("=== Fim da lore ===");
    }
}
