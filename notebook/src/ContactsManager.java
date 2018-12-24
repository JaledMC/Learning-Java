public class ContactsManager {
    /**Creaate an array of contacts,init them with size 500 on the constructor**/
    private Contact[] myFriends;
    private int count;

    ContactsManager(){
        this.count = 0;
        this.myFriends = new Contact[500];
    }
    public void addContact(Contact contact){
        /**Add a contact to the array, and increment the count*/
        this.myFriends[count] = contact;
        count++;
    }
    public Contact searchContact(String nameContact){
        /**Search a contact on the array by name**/
        for(int i=0; i<this.count; i++){
            String name = myFriends[count].getName();
            if(name.equals(nameContact)){
                return myFriends[count];
            }
        }
        return null;
    }
}