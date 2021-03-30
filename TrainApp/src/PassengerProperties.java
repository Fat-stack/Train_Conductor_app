public class PassengerProperties
{
        private int age;
        private String firstName;
        private String lastName;

        public PassengerProperties(String firstName, String lastName, int age)
        {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }



        public void setAge(int age)
        {
        this.age = age;
        }

        public void setFirstName(String firstName)
        {
        this.firstName = firstName;
        }

        public void setLastName(String lastName)
        {
        this.lastName = lastName;
        }


        public int getAge()
        {
        return age;
        }

        public String getFirstName()
        {
        return firstName;
        }

        public String getLastName()
        {
        return lastName;
        }

}



