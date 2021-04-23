import java.io.FileDescriptor;
import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    static ArrayList<aboutFormando> osForm = new ArrayList<>();
    static ArrayList<aboutcursos> osCursos = new ArrayList<>();
    static ArrayList<aboutDisciplinas> asDisc = new ArrayList<>();
    static Continue continuar = new Continue();
    static int identificacaodoFormando = 1;
    static int identificacaodoCurso = 1;
    static int idCDisciplinas = 1;

    public static void main(String[] args) {
        int idCurso = 1;
        Scanner sc = new Scanner(System.in);
        ArrayList<aboutFormando> lista = new ArrayList<>();
        ArrayList<aboutDisciplinas> lista3 = new ArrayList<>();
        Continue continuar = new Continue();
        Menu menus = new Menu();
        ArrayList<aboutcursos> lista2 = new ArrayList<>();
        int escolha = 0;
        int escolhasec = 0;
        do {
            escolha = menus.MenuPrincipal();
            switch (escolha) {
            case 1:
                do {
                    escolhasec = menus.MenuSecundário("Formando");
                    switch (escolhasec) {
                    case 1:
                        insertForm();
                        break;
                    case 2:
                        modifyForm();
                        break;
                    case 3:
                        deleteForm();
                        break;
                    case 4:
                        for (aboutFormando osFormandos : osForm) {
                            System.out.println(osFormandos.toString());
                        }
                        break;
                    }
                } while (escolhasec != 9);
                break;
            case 2:
                do {
                    escolhasec = menus.MenuSecundário("Curso");
                    switch (escolhasec) {
                    case 1:
                        insertCurso();
                        break;
                    case 2:
                        modificarCurso();
                        break;
                    case 3:
                        deleteCurso();
                        break;
                    case 4:
                        for (aboutcursos osCursos : osCursos) {
                            System.out.println(osCursos.toString());
                        }
                        break;
                    }
                } while (escolhasec != 9);
                break;
            case 4:
                do {
                    escolhasec = menus.MenuSecundário("Disciplinas");
                    switch (escolhasec) {
                    case 1:
                        insertDisc();
                        break;
                    case 2:
                        modifyDisc();
                        break;
                    case 3:
                        deleteDisc();
                        break;
                    case 4:
                        for (aboutDisciplinas asDisc : asDisc) {
                            System.out.println(asDisc.toString());
                        }
                        break;
                    }
                } while (escolhasec != 9);
                break;
            }
        } while (escolha != 9);

    }

    private static void modificarCurso() {
        int idCurso = 1;
        if (osCursos.size() == 0) {
            System.out.println("There aren't any Cursos!");
        } else {
            Scanner sc = new Scanner(System.in);
            for (aboutcursos oCursos : osCursos) {
                System.out.println(oCursos.toString());
            }

            System.out.println("ID:");
            int id = sc.nextInt();
            try {
                aboutcursos cursos = osCursos.get(id - 1);
                String nome = sc.nextLine();
                System.out.println("Name:");
                cursos.setNome(sc.nextLine());
                if (!nome.isEmpty())
                    cursos.setNome(sc.nextLine());

                System.out.println("Duration:");
                cursos.setHoras(sc.nextInt());

                System.out.println("Disciplinas:");
                cursos.setDisciplinas(sc.nextLine());

            } catch (Exception e) {
                System.out.println("The Formando " + id + " doesn't");
            }
        }
    }

    private static void modifyForm() {
        if (osForm.size() == 0) {
            System.out.println("No Formando was found.");
        } else {
            Scanner sc = new Scanner(System.in);
            for (aboutFormando oFormando : osForm) {
                System.out.println(oFormando.toString());
            }

            System.out.println("ID:");
            int id = sc.nextInt();
            try {
                aboutFormando formando = osForm.get(id - 1);
                String nome = sc.nextLine();
                System.out.println("Name:");
                formando.setNome(sc.nextLine());
                if (!nome.isEmpty())
                    formando.setNome(sc.nextLine());
                System.out.println("Male (True/False):");
                formando.setMale(sc.nextBoolean());

                System.out.println("Cellphone Number:");
                formando.setTelefones(sc.nextInt());

            } catch (Exception e) {
                System.out.println("The Formando " + id + " wasn't found or doesn't exist.");
            }
        }
    }

    private static void insertCurso() {
        Scanner sc = new Scanner(System.in);
        aboutcursos cursos = new aboutcursos();
        sc = new Scanner(System.in);
        cursos.setIdCurso(identificacaodoCurso++);
        System.out.println("Name:");
        cursos.setNome(sc.nextLine());
        System.out.println("Duration:");
        cursos.setHoras(sc.nextInt());
        System.out.println(asDisc.toString());
        System.out.println("Number of Disciplinas:");
        cursos.setDisciplinas(sc.next());
        osCursos.add(cursos);
    }

    private static void insertForm() {
        Scanner sc = new Scanner(System.in);
        aboutFormando formando = new aboutFormando();
        sc = new Scanner(System.in);
        formando.setIdFormando(identificacaodoFormando++);
        System.out.println("Name:");
        formando.setNome(sc.nextLine());
        System.out.println("Male (True/False):");
        formando.setMale(sc.nextBoolean());

        System.out.println("Cellphone Number:");
        formando.setTelefones(sc.nextInt());

        osForm.add(formando);
    }

    private static void deleteForm() {
        aboutFormando formando = new aboutFormando();
        if (osForm.size() == 0) {
            System.out.println("There are no Formandos.");
        } else {
            Scanner sc = new Scanner(System.in);
            for (aboutFormando oFormando : osForm) {
                System.out.println(oFormando.toString());
            }
            System.out.println("Which Formando/a do you want to delete? (ID)");
            int id = sc.nextInt();
            if (id > 0 && id <= osForm.size()) {
                if (osForm.size() == 0) {
                    System.out.println("No formandos were found!");
                } else {
                    osForm.remove(id - 1);
                    identificacaodoFormando = 2;
                    int j = osForm.size();
                    for (int x = 2; x < j + 1; x++) {
                        formando = osForm.get(x - 1);
                        formando.setIdFormando(identificacaodoFormando++);
                    }

                    System.out.println("The Formando with the ID " + id + " was deleted");
                    for (aboutFormando c : osForm) {
                        System.out.println(c.toString());
                    }
                }
            } else {
                System.out.println("There isn't/It wasn't found a formando with the ID " + id);
            }
        }
    }

    private static void deleteCurso() {
        aboutcursos cursos = new aboutcursos();
        if (osCursos.size() == 0) {
            System.out.println("There are no Cursos");
        } else {
            Scanner sc = new Scanner(System.in);
            for (aboutcursos oCursos : osCursos) {
                System.out.println(oCursos.toString());
            }
            System.out.println("Which curso do you want to delete? (ID)");
            int id = sc.nextInt();
            if (id > 0 && id <= osCursos.size()) {
                if (osCursos.size() == 0) {
                    System.out.println("There are no Cursos!");
                } else {
                    osCursos.remove(id - 1);
                    identificacaodoCurso = 2;
                    int j = osCursos.size();
                    for (int x = 2; x < j + 1; x++) {
                        cursos = osCursos.get(x - 1);
                        cursos.setIdCurso(identificacaodoCurso++);
                    }

                    System.out.println("Curso with the ID " + id + " was deleted.");
                    for (aboutcursos c : osCursos) {
                        System.out.println(c.toString());
                    }
                }
            } else {
                System.out.println("No curso with the ID " + id + "was found.");
            }
        }
    }

    private static void modifyDisc() {
        aboutDisciplinas disciplinas = new aboutDisciplinas();
        if (asDisc.size() == 0) {
            System.out.println("There are no Disciplinas!");
        } else {
            Scanner sc = new Scanner(System.in);
            for (aboutDisciplinas asDisciplinas : asDisc) {
                System.out.println(asDisciplinas.toString());
            }
            System.out.println("ID:");
            int id = sc.nextInt();
            try {
                aboutDisciplinas asDisciplinas = asDisc.get(id - 1);
                String nome = sc.nextLine();
                System.out.println("Name:");
                asDisciplinas.setNomeD(sc.nextLine());
                if (!nome.isEmpty())
                    asDisciplinas.setNomeD(sc.nextLine());

                System.out.println("Duration:");
                asDisciplinas.setHorasD(sc.nextInt());

            } catch (Exception e) {
                System.out.println("The Disciplina with the ID " + id + " wasn't found or doesn't exist.");
            }
        }
    }

    private static void insertDisc() {
        Scanner sc = new Scanner(System.in);
        aboutDisciplinas disciplinas = new aboutDisciplinas();
        sc = new Scanner(System.in);
        disciplinas.setIdDisciplina(idCDisciplinas++);
        System.out.println("Name:");
        disciplinas.setNomeD(sc.nextLine());
        System.out.println("Duration:");
        disciplinas.setHorasD(sc.nextInt());
        asDisc.add(disciplinas);
    }

    private static void deleteDisc() {
        aboutDisciplinas disciplinas = new aboutDisciplinas();
        if (asDisc.size() == 0) {
            System.out.println("There aren't any Disciplinas.");
        } else {
            Scanner sc = new Scanner(System.in);
            for (aboutDisciplinas aDisciplinas : asDisc) {
                System.out.println(aDisciplinas.toString());
            }
            System.out.println("Which Disciplina do you want to delete? (ID)");
            int id = sc.nextInt();
            if (id > 0 && id <= asDisc.size()) {
                if (asDisc.size() == 0) {
                    System.out.println("There aren't any Disciplinas!");
                } else {
                    asDisc.remove(  id - 1);
                    idCDisciplinas = 2;
                    int j = asDisc.size();
                    for (int x = 2; x < j + 1; x++) {
                        disciplinas = asDisc.get(x - 1);
                        disciplinas.setIdDisciplina(idCDisciplinas++);
                    }

                    System.out.println("The Disciplina with the ID " + id + " was deleted.");
                    for (aboutDisciplinas d : asDisc) {
                        System.out.println(d.toString());
                    }
                }
            } else {
                System.out.println("There isn't a Disciplina with the ID " + id);
            }
        }
    }
}

