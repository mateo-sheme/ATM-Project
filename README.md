# ATM-Project

A fully functional ATM system with GUI (Java Swing) and SQL Server as Database. It is mostly designed to be on the administrator side. The ATM is included as example of the user side.

![Banke or ATM](https://github.com/mateo-sheme/ATM-Project/blob/main/imagesATM/ATM1.png)

> Here the admin is presented to either go to the ATM or at the desk.

![ATM Login](https://github.com/mateo-sheme/ATM-Project/blob/main/imagesATM/ATM2.png)      ![After Login ATM](https://github.com/mateo-sheme/ATM-Project/blob/main/imagesATM/ATM3.png)

> The user / admin can enter the card number and also the pin and click the green button to login.
> After login the user can choose either to withdraw or to check balance. The balance afterwards pops up as a message. He can press the cancel button to go back if he wishes to withdraw.

![Chechk Balance](https://github.com/mateo-sheme/ATM-Project/blob/main/imagesATM/ATM4.png)

> If he picks check balance he can enter his personal ID which is assigned directly by the database. This is mostly as an extra layer of security as the owner only knows his ID.

![Withdraw](https://github.com/mateo-sheme/ATM-Project/blob/main/imagesATM/ATM5.png)

> If he picks the withdraw option he can enter again his ID and the amount he wants to withdraw. If no problems faced the user is greeted with a message saying success and the amount withdrawn.

![Final Choice](https://github.com/mateo-sheme/ATM-Project/blob/main/imagesATM/ATM6.png)

> After he finishes the procedure of withdrawing he has a choice if weather he wants to proceed with any other procedures. If not the program closes. If yes it brings it back to the ATM and Desk form.

![Desk](https://github.com/mateo-sheme/ATM-Project/blob/main/imagesATM/ATM7.png)

> Here is where the admin panel is. Here we can create users, update their data or delete them. The users database is shown below as table and gets updated in real-time if changes are done. The data requestd are 
> the name, pin of the user and the number of card alongside the initial deposit. The ID afterward is automatically assiged through idenetiy column, where it auto-increments each time a new user is created.
> If the user would like to update data for example : he needs a new pin, or a new card. The admin just needs to type the name and can proceed to changing them.
> If the user would like to deposit some cash, the admin can use the second panel to do so. He will need the card number and the name of the user as a requirement.
