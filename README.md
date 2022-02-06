# assignment 2
# EMF

On this assignment, we tried to emplement out application domain which is sales transaction, using EMF.
The root class of the metamodel is the 'Company' meta class which have codice fiscale as an attribte and
address and store as references.

### Stores contains Items. Items can be refered by LineItems in transactions. 
### Transactions contains Customer, Cashier, Card and LineItems.
### LineItems contains Items which are defined in stores, Tax, Discount and Additional Charges.
