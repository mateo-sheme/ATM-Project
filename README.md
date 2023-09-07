# ATM-Project

*A fully functional ATM system with GUI (Java Swing) and SQL Server as Database. It is mostly designed to be on the administrator side. The ATM is included as an example of the user side.*

<table align="center">
  <tr>
    <td align="center"><img src="https://github.com/mateo-sheme/ATM-Project/blob/main/imagesATM/ATM1.png" alt="Bank or ATM"></td>
  </tr>
  <tr>
    <td align="center">Here the admin is presented to either go to the ATM or at the desk.</td>
  </tr>
</table>

<table align="center">
  <tr>
    <td align="center"><img src="https://github.com/mateo-sheme/ATM-Project/blob/main/imagesATM/ATM2.png" alt="ATM Login"></td>
    <td align="center"><img src="https://github.com/mateo-sheme/ATM-Project/blob/main/imagesATM/ATM3.png" alt="After Login ATM"></td>
  </tr>
  <tr>
    <td align="center" colspan="2">The user / admin can enter the card number and also the pin and click the green button to login. After login the user can choose either to withdraw or to check balance, the balance afterwards pops up as a message, and he can press the cancel button to go back.</td>
  </tr>
</table>

<table align="center">
  <tr>
    <td align="center"><img src="https://github.com/mateo-sheme/ATM-Project/blob/main/imagesATM/ATM4.png" alt="Check Balance"></td>
    <td align="center"><img src="https://github.com/mateo-sheme/ATM-Project/blob/main/imagesATM/ATM5.png" alt="Withdraw"></td>
  </tr>
  <tr>
    <td align="center">If he picks check balance he can enter his personal ID which is assigned directly by the database. This is mostly as an extra layer of security as the owner only knows his ID.</td>
    <td align="center">If he picks the withdraw option he can enter again his ID and the amount he wants to withdraw. If no problems faced the user is greeted with a message saying success and the amount withdrawn.</td>
  </tr>
</table>

<table align="center">
  <tr>
    <td align="center"><img src="https://github.com/mateo-sheme/ATM-Project/blob/main/imagesATM/ATM6.png" alt="Final Choice"></td>
  </tr>
  <tr>
    <td align="center">After he finishes the procedure of withdrawing he has a choice if weather he wants to proceed with any other procedures. If not the program closes. If yes it brings it back to the ATM and Desk form.</td>
  </tr>
</table>

<table align="center">
  <tr>
    <td align="center"><img src="https://github.com/mateo-sheme/ATM-Project/blob/main/imagesATM/ATM7.png" alt="Desk"></td>
  </tr>
  <tr>
    <td align="center">Here is where the admin panel is. Here we can create users, update their data or delete them. The users database is shown below as table and gets updated in real-time if changes are done. The data requested are the name, pin of the user and the number of card alongside the initial deposit. The ID afterward is automatically assigned through identity column, where it auto-increments each time a new user is created. If the user would like to update data, for example: he needs a new pin, or a new card. The admin just needs to type the name and can proceed to changing them. If the user would like to deposit some cash, the admin can use the second panel to do so. He will need the card number and the name of the user as a requirement.</td>
  </tr>
</table>
