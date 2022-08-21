import java.awt.Color;
import java.awt.Font;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;


public class Main {
    public static void main(String args[]) {
        System.out.println("Running...");
        Font font = new Font("Roboto", Font.BOLD, 38);
        Font newFont = new Font("Roboto", Font.BOLD, 25);
        Font regularFont = new Font("Sans-Seriff", Font.BOLD, 20);

        // Declaringa The Price of All
        // Products==========================================
        double bathSoapPrice = 44;
        double faceCreamPrice = 55;
        double faceWashPrice = 99;
        double hairSprayPrice = 135;
        double hairGelPrice = 152;
        double bodyLoationPrice = 202;

        double ricePrice = 42;
        double foodOilPrice = 198;
        double daalPrice = 190;
        double wheatPrice = 28;
        double sugarPrice = 38;
        double teaPrice = 256;

        double mazaaPrice = 110;
        double cokePrice = 98;
        double frootiPrice = 112;
        double limcaPrice = 114;
        double thumsUpPrice = 102;
        double spritePrice = 118;
        // Declaringa The Price of All
        // Products==========================================

        // Declaring All The Tax on The Product
        // ==================================================
        double taxOnCosmeticProduct = 12;
        double taxOnGrocerryProduct = 14;
        double taxOnChildsProduct = 18;
        // Declaring All The Tax on The Product
        // ==================================================

        // Creating Labels for NavBar================================
        JLabel navLabel = new JLabel();
        navLabel.setText("Billing-SoftWare...");
        navLabel.setFont(font);
        navLabel.setForeground(Color.white);
        navLabel.setBounds(480, 8, 350, 45);
        // Creating Labels for NavBar================================

        // Creating Customer Details
        // Area-===================================================================
        JLabel customerDetailText = new JLabel();
        customerDetailText.setText("Customer Details");
        customerDetailText.setForeground(Color.YELLOW);
        customerDetailText.setBounds(3, -13, 250, 45);
        customerDetailText.setFont(regularFont);

        JLabel customerNameText = new JLabel();
        customerNameText.setText("Customer Name");
        customerNameText.setForeground(Color.BLACK);
        customerNameText.setBounds(50, 15, 250, 45);
        customerNameText.setFont(newFont);

        JLabel customerPhoneNumberText = new JLabel();
        customerPhoneNumberText.setText("Phone Number");
        customerPhoneNumberText.setForeground(Color.BLACK);
        customerPhoneNumberText.setBounds(480, 15, 450, 45);
        customerPhoneNumberText.setFont(newFont);

        JLabel customerBillNumberText = new JLabel();
        customerBillNumberText.setText("Bill Number");
        customerBillNumberText.setForeground(Color.BLACK);
        customerBillNumberText.setBounds(900, 15, 450, 45);
        customerBillNumberText.setFont(newFont);

        JTextArea customerNameTextArea = new JTextArea();
        customerNameTextArea.setLayout(null);
        customerNameTextArea.setBorder(new EmptyBorder(10, 10, 10, 10));
        customerNameTextArea.setFont(regularFont);
        customerNameTextArea.setBounds(250, 22, 200, 35);

        JTextArea customerNumberTextArea = new JTextArea();
        customerNumberTextArea.setLayout(null);
        customerNumberTextArea.setBorder(new EmptyBorder(10, 10, 10, 10));
        customerNumberTextArea.setFont(regularFont);
        customerNumberTextArea.setBounds(670, 22, 200, 35);

        JTextArea customerBillNumberTextArea = new JTextArea();
        customerBillNumberTextArea.setLayout(null);
        customerBillNumberTextArea.setBorder(new EmptyBorder(10, 10, 10, 10));
        customerBillNumberTextArea.setFont(regularFont);
        customerBillNumberTextArea.setBounds(1050, 22, 200, 35);

        JPanel customerDetailsJPanel = new JPanel();
        customerDetailsJPanel.setBackground(Color.RED);
        customerDetailsJPanel.setLayout(null);
        customerDetailsJPanel.setBounds(0, 70, 1340, 70);
        customerDetailsJPanel.add(customerDetailText);
        customerDetailsJPanel.add(customerNameText);
        customerDetailsJPanel.add(customerPhoneNumberText);
        customerDetailsJPanel.add(customerBillNumberText);
        customerDetailsJPanel.add(customerNameTextArea);
        customerDetailsJPanel.add(customerNumberTextArea);
        customerDetailsJPanel.add(customerBillNumberTextArea);
        // Creating Customer Details
        // Area-=================================================================

        // Creating Cosmetic Panel Details Area
        // =================================================================
        JLabel cosmeticdetailsText = new JLabel();
        cosmeticdetailsText.setText("Cosmetics");
        cosmeticdetailsText.setFont(regularFont);
        cosmeticdetailsText.setForeground(Color.YELLOW);
        cosmeticdetailsText.setBounds(2, -10, 200, 45);

        JLabel cosmeticBathSoapText = new JLabel();
        cosmeticBathSoapText.setText("Bath Soap");
        cosmeticBathSoapText.setFont(regularFont);
        cosmeticBathSoapText.setForeground(Color.GREEN);
        cosmeticBathSoapText.setBounds(25, 30, 200, 45);

        JLabel cosmeticFaceCreamText = new JLabel();
        cosmeticFaceCreamText.setText("Face Cream");
        cosmeticFaceCreamText.setFont(regularFont);
        cosmeticFaceCreamText.setForeground(Color.GREEN);
        cosmeticFaceCreamText.setBounds(25, 80, 200, 45);

        JLabel cosmeticFaceWashText = new JLabel();
        cosmeticFaceWashText.setText("Face Wash");
        cosmeticFaceWashText.setFont(regularFont);
        cosmeticFaceWashText.setForeground(Color.GREEN);
        cosmeticFaceWashText.setBounds(25, 130, 200, 45);

        JLabel cosmeticHairSprayText = new JLabel();
        cosmeticHairSprayText.setText("Hair Spary");
        cosmeticHairSprayText.setFont(regularFont);
        cosmeticHairSprayText.setForeground(Color.GREEN);
        cosmeticHairSprayText.setBounds(25, 180, 200, 45);

        JLabel cosmeticHairGelText = new JLabel();
        cosmeticHairGelText.setText("Hair Gel");
        cosmeticHairGelText.setFont(regularFont);
        cosmeticHairGelText.setForeground(Color.GREEN);
        cosmeticHairGelText.setBounds(25, 230, 200, 45);

        JLabel cosmeticBodyLotionText = new JLabel();
        cosmeticBodyLotionText.setText("Body Loation");
        cosmeticBodyLotionText.setFont(regularFont);
        cosmeticBodyLotionText.setForeground(Color.GREEN);
        cosmeticBodyLotionText.setBounds(25, 280, 200, 45);

        JTextArea cosmeticBathSoapTextArea = new JTextArea();
        cosmeticBathSoapTextArea.setLayout(null);
        cosmeticBathSoapTextArea.setBorder(new EmptyBorder(10, 10, 10, 10));
        cosmeticBathSoapTextArea.setFont(regularFont);
        cosmeticBathSoapTextArea.setBounds(160, 30, 80, 35);

        JTextArea cosmeticFaceCreamTextArea = new JTextArea();
        cosmeticFaceCreamTextArea.setLayout(null);
        cosmeticFaceCreamTextArea.setBorder(new EmptyBorder(10, 10, 10, 10));
        cosmeticFaceCreamTextArea.setFont(regularFont);
        cosmeticFaceCreamTextArea.setBounds(160, 80, 80, 35);

        JTextArea cosmeticFaceWashTextArea = new JTextArea();
        cosmeticFaceWashTextArea.setLayout(null);
        cosmeticFaceWashTextArea.setBorder(new EmptyBorder(10, 10, 10, 10));
        cosmeticFaceWashTextArea.setFont(regularFont);
        cosmeticFaceWashTextArea.setBounds(160, 130, 80, 35);

        JTextArea cosmeticHairSprayTextArea = new JTextArea();
        cosmeticHairSprayTextArea.setLayout(null);
        cosmeticHairSprayTextArea.setBorder(new EmptyBorder(10, 10, 10, 10));
        cosmeticHairSprayTextArea.setFont(regularFont);
        cosmeticHairSprayTextArea.setBounds(160, 180, 80, 35);

        JTextArea cosmeticHairGelTextArea = new JTextArea();
        cosmeticHairGelTextArea.setLayout(null);
        cosmeticHairGelTextArea.setBorder(new EmptyBorder(10, 10, 10, 10));
        cosmeticHairGelTextArea.setFont(regularFont);
        cosmeticHairGelTextArea.setBounds(160, 230, 80, 35);

        JTextArea cosmeticBodyLotionTextArea = new JTextArea();
        cosmeticBodyLotionTextArea.setLayout(null);
        cosmeticBodyLotionTextArea.setBorder(new EmptyBorder(10, 10, 10, 10));
        cosmeticBodyLotionTextArea.setFont(regularFont);
        cosmeticBodyLotionTextArea.setBounds(160, 280, 80, 35);

        JPanel cosmeticPanel = new JPanel();
        cosmeticPanel.setLayout(null);
        cosmeticPanel.setBackground(Color.BLUE);
        cosmeticPanel.setBounds(5, 142, 280, 345);
        cosmeticPanel.add(cosmeticdetailsText);
        cosmeticPanel.add(cosmeticBathSoapText);
        cosmeticPanel.add(cosmeticFaceCreamText);
        cosmeticPanel.add(cosmeticFaceWashText);
        cosmeticPanel.add(cosmeticHairSprayText);
        cosmeticPanel.add(cosmeticHairGelText);
        cosmeticPanel.add(cosmeticBodyLotionText);
        cosmeticPanel.add(cosmeticBathSoapTextArea);
        cosmeticPanel.add(cosmeticFaceCreamTextArea);
        cosmeticPanel.add(cosmeticFaceWashTextArea);
        cosmeticPanel.add(cosmeticHairSprayTextArea);
        cosmeticPanel.add(cosmeticHairGelTextArea);
        cosmeticPanel.add(cosmeticBodyLotionTextArea);
        // Creating Cosmetic Details Area
        // =================================================================

        // Creating Grocerry
        // Area=======================================================================
        JLabel grocerryDetailsText = new JLabel();
        grocerryDetailsText.setText("Grocceary");
        grocerryDetailsText.setFont(regularFont);
        grocerryDetailsText.setForeground(Color.YELLOW);
        grocerryDetailsText.setBounds(2, -10, 200, 45);

        JLabel grocceryRiceText = new JLabel();
        grocceryRiceText.setText("Rice");
        grocceryRiceText.setFont(regularFont);
        grocceryRiceText.setForeground(Color.GREEN);
        grocceryRiceText.setBounds(40, 30, 200, 45);

        JLabel grocceryFoodOilText = new JLabel();
        grocceryFoodOilText.setText("Food Oil");
        grocceryFoodOilText.setFont(regularFont);
        grocceryFoodOilText.setForeground(Color.GREEN);
        grocceryFoodOilText.setBounds(40, 80, 200, 45);

        JLabel groceeryDaalText = new JLabel();
        groceeryDaalText.setText("Daal");
        groceeryDaalText.setFont(regularFont);
        groceeryDaalText.setForeground(Color.GREEN);
        groceeryDaalText.setBounds(40, 130, 200, 45);

        JLabel grocceryWheatText = new JLabel();
        grocceryWheatText.setText("Wheat");
        grocceryWheatText.setFont(regularFont);
        grocceryWheatText.setForeground(Color.GREEN);
        grocceryWheatText.setBounds(40, 180, 200, 45);

        JLabel grocerrySugarText = new JLabel();
        grocerrySugarText.setText("Sugar");
        grocerrySugarText.setFont(regularFont);
        grocerrySugarText.setForeground(Color.GREEN);
        grocerrySugarText.setBounds(40, 230, 200, 45);

        JLabel grocerryTeaText = new JLabel();
        grocerryTeaText.setText("Tea");
        grocerryTeaText.setFont(regularFont);
        grocerryTeaText.setForeground(Color.GREEN);
        grocerryTeaText.setBounds(40, 280, 200, 45);

        JTextArea grocerryRiceTextArea = new JTextArea();
        grocerryRiceTextArea.setLayout(null);
        grocerryRiceTextArea.setBorder(new EmptyBorder(10, 10, 10, 10));
        grocerryRiceTextArea.setFont(regularFont);
        grocerryRiceTextArea.setBounds(150, 30, 80, 35);

        JTextArea grocerryFoodOilTextArea = new JTextArea();
        grocerryFoodOilTextArea.setLayout(null);
        grocerryFoodOilTextArea.setBorder(new EmptyBorder(10, 10, 10, 10));
        grocerryFoodOilTextArea.setFont(regularFont);
        grocerryFoodOilTextArea.setBounds(150, 80, 80, 35);

        JTextArea grocerryDaalTextArea = new JTextArea();
        grocerryDaalTextArea.setLayout(null);
        grocerryDaalTextArea.setBorder(new EmptyBorder(10, 10, 10, 10));
        grocerryDaalTextArea.setFont(regularFont);
        grocerryDaalTextArea.setBounds(150, 130, 80, 35);

        JTextArea grocerryWheatTextArea = new JTextArea();
        grocerryWheatTextArea.setLayout(null);
        grocerryWheatTextArea.setBorder(new EmptyBorder(10, 10, 10, 10));
        grocerryWheatTextArea.setFont(regularFont);
        grocerryWheatTextArea.setBounds(150, 180, 80, 35);

        JTextArea grocerrySugarTextArea = new JTextArea();
        grocerrySugarTextArea.setLayout(null);
        grocerrySugarTextArea.setBorder(new EmptyBorder(10, 10, 10, 10));
        grocerrySugarTextArea.setFont(regularFont);
        grocerrySugarTextArea.setBounds(150, 230, 80, 35);

        JTextArea groceeryTeaTextArea = new JTextArea();
        groceeryTeaTextArea.setLayout(null);
        groceeryTeaTextArea.setBorder(new EmptyBorder(10, 10, 10, 10));
        groceeryTeaTextArea.setFont(regularFont);
        groceeryTeaTextArea.setBounds(150, 280, 80, 35);

        JPanel grocerryPanel = new JPanel();
        grocerryPanel.setLayout(null);
        grocerryPanel.setBackground(Color.BLUE);
        grocerryPanel.setBounds(295, 142, 280, 345);
        grocerryPanel.add(grocerryDetailsText);
        grocerryPanel.add(grocceryRiceText);
        grocerryPanel.add(grocceryFoodOilText);
        grocerryPanel.add(groceeryDaalText);
        grocerryPanel.add(grocceryWheatText);
        grocerryPanel.add(grocerrySugarText);
        grocerryPanel.add(grocerryTeaText);
        grocerryPanel.add(grocerryRiceTextArea);
        grocerryPanel.add(grocerryFoodOilTextArea);
        grocerryPanel.add(grocerryDaalTextArea);
        grocerryPanel.add(grocerryWheatTextArea);
        grocerryPanel.add(grocerrySugarTextArea);
        grocerryPanel.add(groceeryTeaTextArea);
        // Creating Grocerry
        // Area=======================================================================

        // Creating Childs Panel
        // Area====================================================================
        JLabel childsDetailsText = new JLabel();
        childsDetailsText.setText("Childs");
        childsDetailsText.setFont(regularFont);
        childsDetailsText.setForeground(Color.YELLOW);
        childsDetailsText.setBounds(2, -10, 200, 45);

        JLabel childsMazaText = new JLabel();
        childsMazaText.setText("Mazaa");
        childsMazaText.setFont(regularFont);
        childsMazaText.setForeground(Color.GREEN);
        childsMazaText.setBounds(40, 30, 200, 45);

        JLabel childsCokeText = new JLabel();
        childsCokeText.setText("Coke");
        childsCokeText.setFont(regularFont);
        childsCokeText.setForeground(Color.GREEN);
        childsCokeText.setBounds(40, 80, 200, 45);

        JLabel childsFrootiText = new JLabel();
        childsFrootiText.setText("Frooti");
        childsFrootiText.setFont(regularFont);
        childsFrootiText.setForeground(Color.GREEN);
        childsFrootiText.setBounds(40, 130, 200, 45);

        JLabel childsLimcaText = new JLabel();
        childsLimcaText.setText("Limca");
        childsLimcaText.setFont(regularFont);
        childsLimcaText.setForeground(Color.GREEN);
        childsLimcaText.setBounds(40, 180, 200, 45);

        JLabel childsThumbUpText = new JLabel();
        childsThumbUpText.setText("ThumbsUp");
        childsThumbUpText.setFont(regularFont);
        childsThumbUpText.setForeground(Color.GREEN);
        childsThumbUpText.setBounds(40, 230, 200, 45);

        JLabel childsSpriteText = new JLabel();
        childsSpriteText.setText("Sprite");
        childsSpriteText.setFont(regularFont);
        childsSpriteText.setForeground(Color.GREEN);
        childsSpriteText.setBounds(40, 280, 200, 45);

        JTextArea childsMazaTextArea = new JTextArea();
        childsMazaTextArea.setLayout(null);
        childsMazaTextArea.setBorder(new EmptyBorder(10, 10, 10, 10));
        childsMazaTextArea.setFont(regularFont);
        childsMazaTextArea.setBounds(150, 30, 80, 35);

        JTextArea childsCokeTextArea = new JTextArea();
        childsCokeTextArea.setLayout(null);
        childsCokeTextArea.setBorder(new EmptyBorder(10, 10, 10, 10));
        childsCokeTextArea.setFont(regularFont);
        childsCokeTextArea.setBounds(150, 80, 80, 35);

        JTextArea childsFrootiTextArea = new JTextArea();
        childsFrootiTextArea.setLayout(null);
        childsFrootiTextArea.setBorder(new EmptyBorder(10, 10, 10, 10));
        childsFrootiTextArea.setFont(regularFont);
        childsFrootiTextArea.setBounds(150, 130, 80, 35);

        JTextArea childsLimcaTextArea = new JTextArea();
        childsLimcaTextArea.setLayout(null);
        childsLimcaTextArea.setBorder(new EmptyBorder(10, 10, 10, 10));
        childsLimcaTextArea.setFont(regularFont);
        childsLimcaTextArea.setBounds(150, 180, 80, 35);

        JTextArea childsThumbsUpTextArea = new JTextArea();
        childsThumbsUpTextArea.setLayout(null);
        childsThumbsUpTextArea.setBorder(new EmptyBorder(10, 10, 10, 10));
        childsThumbsUpTextArea.setFont(regularFont);
        childsThumbsUpTextArea.setBounds(150, 230, 80, 35);

        JTextArea childsSpriteTextArea = new JTextArea();
        childsSpriteTextArea.setLayout(null);
        childsSpriteTextArea.setBorder(new EmptyBorder(10, 10, 10, 10));
        childsSpriteTextArea.setFont(regularFont);
        childsSpriteTextArea.setBounds(150, 280, 80, 35);

        JPanel childsPanel = new JPanel();
        childsPanel.setLayout(null);
        childsPanel.setBackground(Color.BLUE);
        childsPanel.setBounds(585, 142, 280, 345);
        childsPanel.add(childsDetailsText);
        childsPanel.add(childsMazaText);
        childsPanel.add(childsCokeText);
        childsPanel.add(childsFrootiText);
        childsPanel.add(childsLimcaText);
        childsPanel.add(childsThumbUpText);
        childsPanel.add(childsSpriteText);
        childsPanel.add(childsMazaTextArea);
        childsPanel.add(childsCokeTextArea);
        childsPanel.add(childsFrootiTextArea);
        childsPanel.add(childsLimcaTextArea);
        childsPanel.add(childsThumbsUpTextArea);
        childsPanel.add(childsSpriteTextArea);
        // Creating Childs Panel
        // Area====================================================================

        // Creating Bill
        // Area============================================================================

        JLabel billDetailsMenu = new JLabel();
        billDetailsMenu.setText("Bill Menu");
        billDetailsMenu.setLayout(null);
        billDetailsMenu.setForeground(Color.YELLOW);
        billDetailsMenu.setFont(regularFont);
        billDetailsMenu.setBounds(2, -5, 180, 30);

        JLabel totalCosmeticPriceText = new JLabel();
        totalCosmeticPriceText.setText("Total Cosmetic Price");
        totalCosmeticPriceText.setLayout(null);
        totalCosmeticPriceText.setForeground(Color.GREEN);
        totalCosmeticPriceText.setFont(regularFont);
        totalCosmeticPriceText.setBounds(15, 40, 380, 30);

        JLabel totalGrocerryPriceText = new JLabel();
        totalGrocerryPriceText.setText("Total Grocerry Price");
        totalGrocerryPriceText.setLayout(null);
        totalGrocerryPriceText.setForeground(Color.GREEN);
        totalGrocerryPriceText.setFont(regularFont);
        totalGrocerryPriceText.setBounds(15, 90, 380, 30);

        JLabel totalChildsPriceText = new JLabel();
        totalChildsPriceText.setText("Total Childs Price");
        totalChildsPriceText.setLayout(null);
        totalChildsPriceText.setForeground(Color.GREEN);
        totalChildsPriceText.setFont(regularFont);
        totalChildsPriceText.setBounds(15, 140, 380, 30);

        JLabel totalCosmeticPriceTaxText = new JLabel();
        totalCosmeticPriceTaxText.setText("Total Cosmetic Tax");
        totalCosmeticPriceTaxText.setLayout(null);
        totalCosmeticPriceTaxText.setForeground(Color.GREEN);
        totalCosmeticPriceTaxText.setFont(regularFont);
        totalCosmeticPriceTaxText.setBounds(400, 40, 380, 30);

        JLabel totalGrocerryPriceTaxText = new JLabel();
        totalGrocerryPriceTaxText.setText("Total Grocerry Tax");
        totalGrocerryPriceTaxText.setLayout(null);
        totalGrocerryPriceTaxText.setForeground(Color.GREEN);
        totalGrocerryPriceTaxText.setFont(regularFont);
        totalGrocerryPriceTaxText.setBounds(400, 90, 380, 30);

        JLabel totalChildsPriceTaxText = new JLabel();
        totalChildsPriceTaxText.setText("Total Childs Tax");
        totalChildsPriceTaxText.setLayout(null);
        totalChildsPriceTaxText.setForeground(Color.GREEN);
        totalChildsPriceTaxText.setFont(regularFont);
        totalChildsPriceTaxText.setBounds(400, 140, 380, 30);

        JTextArea totalCosmeticTextArea = new JTextArea();
        totalCosmeticTextArea.setLayout(null);
        totalCosmeticTextArea.setBorder(new EmptyBorder(10, 10, 10, 10));
        totalCosmeticTextArea.setFont(regularFont);
        totalCosmeticTextArea.setBounds(250, 40, 120, 35);

        JTextArea totalGrocerryTextArea = new JTextArea();
        totalGrocerryTextArea.setLayout(null);
        totalGrocerryTextArea.setBorder(new EmptyBorder(10, 10, 10, 10));
        totalGrocerryTextArea.setFont(regularFont);
        totalGrocerryTextArea.setBounds(250, 90, 120, 35);

        JTextArea totalChildsTextArea = new JTextArea();
        totalChildsTextArea.setLayout(null);
        totalChildsTextArea.setBorder(new EmptyBorder(10, 10, 10, 10));
        totalChildsTextArea.setFont(regularFont);
        totalChildsTextArea.setBounds(250, 140, 120, 35);

        JTextArea totalCosmeticTaxTextArea = new JTextArea();
        totalCosmeticTaxTextArea.setLayout(null);
        totalCosmeticTaxTextArea.setBorder(new EmptyBorder(10, 10, 10, 10));
        totalCosmeticTaxTextArea.setFont(regularFont);
        totalCosmeticTaxTextArea.setBounds(600, 40, 120, 35);

        JTextArea totalGrocerryTaxTextArea = new JTextArea();
        totalGrocerryTaxTextArea.setLayout(null);
        totalGrocerryTaxTextArea.setBorder(new EmptyBorder(10, 10, 10, 10));
        totalGrocerryTaxTextArea.setFont(regularFont);
        totalGrocerryTaxTextArea.setBounds(600, 90, 120, 35);

        JTextArea totalChildsTaxTextArea = new JTextArea();
        totalChildsTaxTextArea.setLayout(null);
        totalChildsTaxTextArea.setBorder(new EmptyBorder(10, 10, 10, 10));
        totalChildsTaxTextArea.setFont(regularFont);
        totalChildsTaxTextArea.setBounds(600, 140, 120, 35);

        JPanel billAreaMenu = new JPanel();
        billAreaMenu.setLayout(null);
        billAreaMenu.setBackground(Color.BLUE);
        billAreaMenu.setBounds(5, 495, 750, 230);
        billAreaMenu.add(billDetailsMenu);
        billAreaMenu.add(totalCosmeticPriceText);
        billAreaMenu.add(totalGrocerryPriceText);
        billAreaMenu.add(totalChildsPriceText);
        billAreaMenu.add(totalCosmeticPriceTaxText);
        billAreaMenu.add(totalGrocerryPriceTaxText);
        billAreaMenu.add(totalChildsPriceTaxText);
        billAreaMenu.add(totalCosmeticTextArea);
        billAreaMenu.add(totalGrocerryTextArea);
        billAreaMenu.add(totalChildsTextArea);
        billAreaMenu.add(totalCosmeticTaxTextArea);
        billAreaMenu.add(totalGrocerryTaxTextArea);
        billAreaMenu.add(totalChildsTaxTextArea);
        // Creating Bill
        // Area============================================================================

        // Creating Total Bill Area Panel Button
        // ===================================================

        JButton totalButton = new JButton();
        totalButton.setText("Total");
        totalButton.setFont(font);
        totalButton.setBackground(Color.RED);
        totalButton.setForeground(Color.BLACK);
        totalButton.setBounds(20, 80, 150, 50);

        totalButton.addActionListener((e) -> {
            System.out.println("This button is Clicked..");

            String cosmeticBathSoapStr = cosmeticBathSoapTextArea.getText();
            double cosmeticBathSoapDbl = Double.parseDouble(cosmeticBathSoapStr);

            double totalAmtofBathSoap = cosmeticBathSoapDbl * bathSoapPrice;
            double totalAmtofBathSoapWithTax = totalAmtofBathSoap * taxOnCosmeticProduct / 100;
            // System.out.println(totalAmtofBathSoapWithTax+" Tax AMt");
            double grandTotalofBathSoap = totalAmtofBathSoap + totalAmtofBathSoapWithTax;
            System.out.println(grandTotalofBathSoap + " Bath Soap");

            String cosmeticFaceCreamStr = cosmeticFaceCreamTextArea.getText();
            double cosmeticFaceCreamDbl = Double.parseDouble(cosmeticFaceCreamStr);
            // System.out.println(cosmeticFaceCreamDbl+" Face Cream");

            double totalAmtofFaceCream = cosmeticFaceCreamDbl * faceCreamPrice;
            double totalAmtofFaceCreamwithTax = totalAmtofFaceCream * taxOnCosmeticProduct / 100;
            double grandtotalAmtoffaceCream = totalAmtofFaceCream + totalAmtofFaceCreamwithTax;
            System.out.println(grandtotalAmtoffaceCream + " Face Cream..");

            String cosmeticFaceWashStr = cosmeticFaceWashTextArea.getText();
            double cosmeticFaceWashDbl = Double.parseDouble(cosmeticFaceWashStr);

            double totalAmtofFaceWash = cosmeticFaceWashDbl * faceWashPrice;
            double totalAmtofFaceWashwithTax = totalAmtofFaceWash * taxOnCosmeticProduct / 100;
            double grandTotalAmtoffaceWash = totalAmtofFaceWash + totalAmtofFaceWashwithTax;
            System.out.println(grandTotalAmtoffaceWash + " Face Wash..");

            String cosmeticHairSprayStr = cosmeticHairSprayTextArea.getText();
            double cosmeticHairSprayDbl = Double.parseDouble(cosmeticHairSprayStr);

            double totalAmtofHairSpray = cosmeticHairSprayDbl * hairSprayPrice;
            double taotalAmtofHairSpraywithTax = totalAmtofHairSpray * taxOnCosmeticProduct / 100;
            double grandTotalAmtofHairSpray = totalAmtofHairSpray + taotalAmtofHairSpraywithTax;
            System.out.println(grandTotalAmtofHairSpray + " Hair Spray..");

            String cosmeticHairGelStr = cosmeticHairGelTextArea.getText();
            double cosmeticHairGelDbl = Double.parseDouble(cosmeticHairGelStr);

            double totalAmtofHairGel = cosmeticHairGelDbl * hairGelPrice;
            double totalAmtofHairGelwithTax = totalAmtofHairGel * taxOnCosmeticProduct / 100;
            double grandTotalAmtofHairGel = totalAmtofHairGel + totalAmtofHairGelwithTax;
            System.out.println(grandTotalAmtofHairGel + " Hair gEL..");

            String cosmeticBodyLoationStr = cosmeticBodyLotionTextArea.getText();
            double cosmeticBodyLoationDbl = Double.parseDouble(cosmeticBodyLoationStr);

            double totalAmtofBodyLotion = cosmeticBodyLoationDbl * bodyLoationPrice;
            double totalAmtofBodyLoationwithTax = totalAmtofBodyLotion * taxOnCosmeticProduct / 100;
            double grandTotalAmtofBodyLotion = totalAmtofBodyLotion + totalAmtofBodyLoationwithTax;
            System.out.println(grandTotalAmtofBodyLotion + " Body Lotion..");

            // Max Total Amt of Cosmetic Product---------------
            double maxTotalCosmeticProduct = grandTotalofBathSoap + grandtotalAmtoffaceCream + grandTotalAmtoffaceWash
                    + grandTotalAmtofHairSpray + grandTotalAmtofHairGel + grandTotalAmtofBodyLotion;
            System.out.println(maxTotalCosmeticProduct + " Max Total Amt Cosmetic");

            DecimalFormat formatForCosmetic = new DecimalFormat("0.#");
            totalCosmeticTextArea.setText(formatForCosmetic.format(maxTotalCosmeticProduct));
            // Max Total Amt of Cosmetic Product---------------

            // All Tax on Cosmetic Products----------------
            double allTaxOnCosmetics = totalAmtofBathSoapWithTax + totalAmtofFaceCreamwithTax
                    + totalAmtofFaceWashwithTax + taotalAmtofHairSpraywithTax + totalAmtofHairGelwithTax
                    + totalAmtofBodyLoationwithTax;
            DecimalFormat formatForTotalTaxOnCosmetic = new DecimalFormat("0.#");
            totalCosmeticTaxTextArea.setText(formatForTotalTaxOnCosmetic.format(allTaxOnCosmetics));
            // All Tax on Cosmetic Products----------------

            // Grocerry Products---------------------
            String grocerryRiceStr = grocerryRiceTextArea.getText();
            double grocerryRiceDbl = Double.parseDouble(grocerryRiceStr);
            System.out.println(grocerryRiceDbl + " Rice Double");

            double totalAmtofRice = grocerryRiceDbl * ricePrice;
            double totalAmtofRicewithTax = totalAmtofRice * taxOnGrocerryProduct / 100;
            double grandTotalAmtofRice = totalAmtofRice + totalAmtofRicewithTax;
            System.out.println(grandTotalAmtofRice + " Rice Price");

            String grocerryFoodOilStr = grocerryFoodOilTextArea.getText();
            double grocerryFoodOilDbl = Double.parseDouble(grocerryFoodOilStr);

            double totalAmtofFoodOil = grocerryFoodOilDbl * foodOilPrice;
            double totalAmtofFoodOilwithTax = totalAmtofFoodOil * taxOnGrocerryProduct / 100;
            double grandAmtofFoodOil = totalAmtofFoodOil + totalAmtofFoodOilwithTax;

            String grocerryDalStr = grocerryDaalTextArea.getText();
            double grocerryDaalDbl = Double.parseDouble(grocerryDalStr);

            double totalAmtofDall = grocerryDaalDbl * daalPrice;
            double totalAmtofDaalwithTax = totalAmtofDall * taxOnGrocerryProduct / 100;
            double grandTotalAmtofDal = totalAmtofDall + totalAmtofDaalwithTax;

            String grocerryWheatStr = grocerryWheatTextArea.getText();
            double grocerryWheatDbl = Double.parseDouble(grocerryWheatStr);

            double totalAmtofWheat = grocerryWheatDbl * wheatPrice;
            double totalAmtofWheatwithTax = totalAmtofWheat * taxOnGrocerryProduct / 100;
            double grandTotalAmtofWheat = totalAmtofWheat + totalAmtofWheatwithTax;

            String grocerrySugarStr = grocerrySugarTextArea.getText();
            double grocerrySugarDbl = Double.parseDouble(grocerrySugarStr);

            double totalAmtofSugar = grocerrySugarDbl * sugarPrice;
            double totalAmtofSugarwithTax = totalAmtofSugar * taxOnGrocerryProduct / 100;
            double grandtotalAmtofSugar = totalAmtofSugar + totalAmtofSugarwithTax;

            String grocerryTeaStr = groceeryTeaTextArea.getText();
            double grocerryTeaDbl = Double.parseDouble(grocerryTeaStr);

            double totalAmtofTea = grocerryTeaDbl * teaPrice;
            double totalAmtofTeawithTax = totalAmtofTea * taxOnGrocerryProduct / 100;
            double grandTotalAmtofTea = totalAmtofTea + totalAmtofTeawithTax;

            // Max Sum Of Grocerry Product------
            double maxTotalGrocerryProduct = grandTotalAmtofRice + grandAmtofFoodOil + grandTotalAmtofDal
                    + grandTotalAmtofWheat + grandtotalAmtofSugar + grandTotalAmtofTea;
            System.out.println(maxTotalGrocerryProduct + " Max Total AMt of Grocerry");

            DecimalFormat formatForGrocerry = new DecimalFormat("0.#");
            totalGrocerryTextArea.setText(formatForGrocerry.format(maxTotalGrocerryProduct));
            // Max Sum Of Grocerry Product------

            // All tax on Grocerry Products
            double allTaxonGrocerryProducts = totalAmtofRicewithTax + totalAmtofFoodOilwithTax + totalAmtofDaalwithTax
                    + totalAmtofWheatwithTax + totalAmtofSugarwithTax + totalAmtofTeawithTax;
            DecimalFormat fromatForAllTaxOnGrocerry = new DecimalFormat("0.#");
            totalGrocerryTaxTextArea.setText(fromatForAllTaxOnGrocerry.format(allTaxonGrocerryProducts));
            // All tax on Grocerry Products

            String childsMazaStr = childsMazaTextArea.getText();
            double childsMazaDbl = Double.parseDouble(childsMazaStr);

            double totalAmtofMazaa = childsMazaDbl * mazaaPrice;
            double totalAmtofMazawithTax = totalAmtofMazaa * taxOnChildsProduct / 100;
            double grandTotalAmtofMaza = totalAmtofMazaa + totalAmtofMazawithTax;

            String childsCokeStr = childsCokeTextArea.getText();
            double childsCokeDbl = Double.parseDouble(childsCokeStr);

            double totalAmtofCoke = childsCokeDbl * cokePrice;
            double totalAmtofCokewithTax = totalAmtofCoke * taxOnChildsProduct / 100;
            double grandTotalAmtofCoke = totalAmtofCoke + totalAmtofCokewithTax;

            String childsFrootiStr = childsFrootiTextArea.getText();
            double childsFrootiDbl = Double.parseDouble(childsFrootiStr);

            double totalFrootiAmt = childsFrootiDbl * frootiPrice;
            double totalAmtofFrootiwithTax = totalFrootiAmt * taxOnChildsProduct / 100;
            double grandTotalAmtofFrooti = totalFrootiAmt + totalAmtofFrootiwithTax;

            String childsLimcaStr = childsLimcaTextArea.getText();
            double childsLimcaDbl = Double.parseDouble(childsLimcaStr);

            double totalLimcaAmt = childsLimcaDbl * limcaPrice;
            double totalLimcaAmtwithTax = totalLimcaAmt * taxOnChildsProduct / 100;
            double grandtotalAmtofLimca = totalLimcaAmt + totalLimcaAmtwithTax;

            String childsThumbsUpStr = childsThumbsUpTextArea.getText();
            double childsThumbsUpDbl = Double.parseDouble(childsThumbsUpStr);

            double totalThumbsUpAmt = childsThumbsUpDbl * thumsUpPrice;
            double totalThumbsUpAmtwithTax = totalThumbsUpAmt * taxOnChildsProduct / 100;
            double grandTotalAmtofThumbsUp = totalThumbsUpAmt + totalThumbsUpAmtwithTax;

            String childsSpriteStr = childsSpriteTextArea.getText();
            double childsSpriteDbl = Double.parseDouble(childsSpriteStr);

            double totalSpriteAmt = childsSpriteDbl * spritePrice;
            double totalSpriteAmtwithTax = totalSpriteAmt * taxOnChildsProduct / 100;
            double grandTotalAmtofSprite = totalSpriteAmt + totalSpriteAmtwithTax;

            // Adding Max Total Cosmetic Price----------------------
            double maxTotalChildsProduct = grandTotalAmtofMaza + grandTotalAmtofCoke + grandTotalAmtofFrooti
                    + grandtotalAmtofLimca + grandTotalAmtofThumbsUp + grandTotalAmtofSprite;
            System.out.println(maxTotalChildsProduct + " Max Total Amt Childs Product");

            DecimalFormat formatforChilds = new DecimalFormat("0.#");
            totalChildsTextArea.setText(formatforChilds.format(maxTotalChildsProduct));
            // Adding Max Total Cosmetic Price-----------------------

            // Adding All Tax on Childs---------------------------
            double alltaxOnChildsProducts = totalAmtofMazawithTax + totalAmtofCokewithTax + totalAmtofFrootiwithTax
                    + totalLimcaAmtwithTax + totalThumbsUpAmtwithTax + totalSpriteAmtwithTax;
            DecimalFormat formatForAllTaxOnChilds = new DecimalFormat("0.#");
            totalChildsTaxTextArea.setText(formatForAllTaxOnChilds.format(alltaxOnChildsProducts));

            // Adding All Tax on Childs---------------------------

            // Building Main Logic
            // Here===================================================================

        });

        JButton clearButton = new JButton();
        clearButton.setText("Clear");
        clearButton.setFont(font);
        clearButton.setBackground(Color.RED);
        clearButton.setForeground(Color.BLACK);
        clearButton.setBounds(180, 80, 150, 50);

        clearButton.addActionListener((e) ->{
            
            // Cosmetic Panel Clear=========================
            cosmeticBathSoapTextArea.setText("");
            cosmeticFaceCreamTextArea.setText("");
            cosmeticFaceWashTextArea.setText("");
            cosmeticHairSprayTextArea.setText("");
            cosmeticHairGelTextArea.setText("");
            cosmeticBodyLotionTextArea.setText("");
            totalCosmeticTextArea.setText("");
            totalCosmeticTaxTextArea.setText("");
            // Cosmetic Panel Clear=========================

            // Grocerry Panel Clear=========================
            grocerryRiceTextArea.setText("");
            grocerryFoodOilTextArea.setText("");
            grocerryDaalTextArea.setText("");
            grocerryWheatTextArea.setText("");
            grocerrySugarTextArea.setText("");
            groceeryTeaTextArea.setText("");
            totalGrocerryTextArea.setText("");
            totalGrocerryTaxTextArea.setText("");
            // Grocerry Panel Clear=========================

            // Childs Panel Clear=========================
            childsMazaTextArea.setText("");
            childsCokeTextArea.setText("");
            childsFrootiTextArea.setText("");
            childsLimcaTextArea.setText("");
            childsThumbsUpTextArea.setText("");
            childsSpriteTextArea.setText("");
            totalChildsTextArea.setText("");
            totalChildsTaxTextArea.setText("");
            // Childs Panel Clear=========================

        } );


        // Bill Panel---
        JPanel totalBillButtonPanel = new JPanel();
        totalBillButtonPanel.setLayout(null);
        totalBillButtonPanel.setBackground(Color.BLUE);
        totalBillButtonPanel.setBounds(780, 565, 550, 160);
        totalBillButtonPanel.add(totalButton);
        totalBillButtonPanel.add(clearButton);

        // Creating Total Bill Area Panel Button
        // ===================================================

        // Creating NavPanel for NavBar=====================================
        JPanel navPanel = new JPanel();
        navPanel.setBackground(Color.BLUE);
        navPanel.setLayout(null);
        navPanel.setBounds(0, 2, 1348, 65);
        navPanel.add(navLabel);
        // Creating NavPanel for NavBar=====================================

        // Creating Reatail Bill Panel--------------

        JTextArea retailTextArea = new JTextArea();
        retailTextArea.setLayout(null);
        retailTextArea.setFont(regularFont);
        retailTextArea.setBounds(5, 5, 450, 410);

        JPanel retailBillPanel = new JPanel();
        retailBillPanel.setLayout(null);
        retailBillPanel.setBackground(Color.BLUE);
        retailBillPanel.setBounds(870, 143, 460, 420);
        retailBillPanel.add(retailTextArea);
        // Creating Reatail Bill Panel--------------

        // Creating Frame for Main Windows--------------
        JFrame frame = new JFrame("Billing App By Arpit");
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.cyan);
        frame.setSize(1350, 770);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        frame.add(navPanel);
        frame.add(customerDetailsJPanel);
        frame.add(cosmeticPanel);
        frame.add(grocerryPanel);
        frame.add(childsPanel);
        frame.add(billAreaMenu);
        frame.add(totalBillButtonPanel);
        frame.add(retailBillPanel);
        frame.setVisible(true);
        // Creating Frame for Main Windows--------------
    }
}

