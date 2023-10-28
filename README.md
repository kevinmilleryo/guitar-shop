# WESTERN GOVERNOR UNIVERSITY 
## D287 – JAVA FRAMEWORKS
C.  Changed title on line 14, headers on lines 19 and 53 and button on line 67 to reflect my choice of store, a custom guitar shop.  

D.  Created new html file called about.html.  Added header that says "About" on line 5. Added header on line 8 and paragraph of text on lines 10 & 11. 
Created AboutController for navigation to the about page. 
Added a link on the about page back to the main page on line 18, and a link to the about page from the mainscreen page on line 20.

E.  Added conditional to check that inventory is empty at line 58 in BootStrapData.java.  Added samples parts and product on lines 59-129.

F.  Added buy now button next to update button on main page (lines 83-88) with post functionality, passing productId through the form.
    Created new html templates for buySuccess and buyFailure.  Added method decrementInventory in ProductService interface (line 20).
    Implemented decrementInventory method in ProductServiceImpl file (lines 69-79).
    Added and implemented BuyNowController, BuySuccessController, and BuyFailureController.

G.  Modify the parts to track maximum and minimum inventory by doing the following:
•  Add additional fields to the part entity for maximum and minimum inventory.
•  Modify the sample inventory to include the maximum and minimum fields.
•  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
•  Rename the file the persistent storage is saved to.
•  Modify the code to enforce that the inventory is between or at the minimum and maximum value.

H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:
•  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
•  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
•  Display error messages when adding and updating parts if the inventory is greater than the maximum.

I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.

J.  Remove the class files for any unused validators in order to clean your code.
