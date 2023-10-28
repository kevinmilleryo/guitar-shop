# WESTERN GOVERNOR UNIVERSITY 
## D287 – JAVA FRAMEWORKS
C.  Changed title on line 14, headers on lines 19 and 53 and button on line 67 to reflect my choice of store, a custom guitar shop.  

D.  Created new html file called about.html.  Added header that says "About" on line 5. Added header on line 8 and paragraph of text on lines 10 & 11. 
Created AboutController for navigation to the about page. 
Added a link on the about page back to the main page on line 18, and a link to the about page from the mainscreen page on line 20.

E.  Added conditional to check that inventory is empty at line 58 in BootStrapData.java.  Added sample parts and products on lines 59-129.

F.  Added buy now button next to update button on main page (lines 83-88) with post functionality, passing productId through the form.
    Created new html templates for buySuccess and buyFailure.  Added method decrementInventory in ProductService interface (line 20).
    Implemented decrementInventory method in ProductServiceImpl file (lines 69-79).
    Added and implemented BuyNowController, BuySuccessController, and BuyFailureController.

G.  Modified Part.java with min and max fields (lines 33-37) and getter and setter methods (lines 92-106).
    Modified sample part inventory in BootStrapData.java to add min and max values (lines 58-107).  
    Modified OutsourcedPartForm.html (line 27-31) and InhousePartForm.html(lines 26-30) to add fields for min and max values.
    Renamed database file to d287-java-frameworks-db102.mv.db and updated in the applications.properties file (line 6)
    Created method in Part.java to check if inventory value is valid (line 116).
    Implemented said method in InhousePart.java (lines 24-27) and OutsourcedPart.java (lines 25-27).
    Used isInValid method in AddInhousePartController.java (lines 45-48) and AddOutsourcedPartController.java (lines 46-49) to verify inventory values fall within range and return errors if not.
    Verified that all of these implementations were working properly.

H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:
    Added validation logic to AddInhousePartController (lines 45-51) and AddOutSourcedPartController (lines 46-53).  
    Added validation logic to AddProductController (lines 54-58).

I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.

J.  Remove the class files for any unused validators in order to clean your code.
