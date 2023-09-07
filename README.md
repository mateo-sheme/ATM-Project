# ATM-Project

A fully functional ATM system with GUI (Java Swing) and SQL Server as a Database. It is mostly designed to be on the administrator side. The ATM is included as an example of the user side.

<div style="display: flex; justify-content: space-between;">
    <div style="flex: 1; padding-right: 10px;">
        <img src="https://github.com/mateo-sheme/ATM-Project/blob/main/imagesATM/ATM1.png" alt="Banke or ATM" width="100%">
    </div>
    <div style="flex: 1; padding-left: 10px;">
        <img src="https://github.com/mateo-sheme/ATM-Project/blob/main/imagesATM/ATM2.png" alt="ATM Login" width="100%">
    </div>
</div>

> Here the admin is presented to either go to the ATM or at the desk.

<div style="display: flex; justify-content: space-between;">
    <div style="flex: 1; padding-right: 10px;">
        <img src="https://github.com/mateo-sheme/ATM-Project/blob/main/imagesATM/ATM3.png" alt="After Login ATM" width="100%">
    </div>
    <div style="flex: 1; padding-left: 10px;">
        <img src="https://github.com/mateo-sheme/ATM-Project/blob/main/imagesATM/ATM4.png" alt="Check Balance" width="100%">
    </div>
</div>

> The user/admin can enter the card number and also the pin and click the green button to login.
> After login, the user can choose either to withdraw or to check the balance. The balance afterward pops up as a message. He can press the cancel button to go back if he wishes to withdraw.

<div style="display: flex; justify-content: space-between;">
    <div style="flex: 1; padding-right: 10px;">
        <img src="https://github.com/mateo-sheme/ATM-Project/blob/main/imagesATM/ATM5.png" alt="Withdraw" width="100%">
    </div>
    <div style="flex: 1; padding-left: 10px;">
        <img src="https://github.com/mateo-sheme/ATM-Project/blob/main/imagesATM/ATM6.png" alt="Final Choice" width="100%">
    </div>
</div>

> If he finishes the procedure of withdrawing, he has a choice of whether he wants to proceed with any other procedures. If not, the program closes. If yes, it brings it back to the ATM and Desk form.

<div style="display: flex; justify-content: space-between;">
    <div style="flex: 1; padding-right: 10px;">
        <img src="https://github.com/mateo-sheme/ATM-Project/blob/main/imagesATM/ATM7.png" alt="Desk" width="100%">
    </div>
</div>

> Here is where the admin panel is. Here we can create users, update their data, or delete them. The users' database is shown below as a table and gets updated in real-time if changes are done. The data requested are the name, pin of the user, and the number of card alongside the initial deposit. The ID afterward is automatically assigned through the identity column, where it auto-increments each time a new user is created. If the user would like to update data, for example: he needs a new pin, or a new card. The admin just needs to type the name and can proceed to change them. If the user would like to deposit some cash, the admin can use the second panel to do so. He will need the card number and the name of the user as a requirement.
