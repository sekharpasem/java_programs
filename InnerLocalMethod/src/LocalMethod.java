public class LocalMethod {

    public void print(){

        class TeamNames{

            private String[] names = {"Ravi", "rahul", "suri", "ram", "sekhar", "manoj"};

            public String[] getNames(){

                return this.names;
            }

        }


        TeamNames team = new TeamNames();
        String[] names = team.getNames();

        System.out.println("Team names are :");
        for (String name:names) {

            System.out.println(name);
         }

        for(int i = 0; i>names.length; i++){
            System.out.println(names[i]);

        }





    }
}
