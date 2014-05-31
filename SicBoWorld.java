import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class SicBoWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SicBoWorld extends World
{
     /**
     * Constructor for objects of class SicBoWorld.
     * 
     */
    
    
    public SicBoWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1400, 900, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Small small = new Small();
        addObject(small, 127, 105);
        Big big = new Big();
        addObject(big, 843, 121);
        small.setLocation(113, 95);
        big.setLocation(860, 113);
        big.setLocation(885, 111);
        Number_5 number_5 = new Number_5();
        addObject(number_5, 157, 288);
        Number_4 number_4= new Number_4();
        addObject(number_4, 69, 297);
        number_5.setLocation(167, 295);
        Number_6 number_6 = new Number_6();
        addObject(number_6, 273, 300);
        number_6.setLocation(266, 295);
        Number_7 number_7 = new Number_7();
        addObject(number_7, 369, 303);
        number_7.setLocation(361, 298);
        Number_8 number_8 = new Number_8();
        addObject(number_8, 463, 300);
        number_8.setLocation(456, 298);
        Number_9 number_9 = new Number_9();
        addObject(number_9, 559, 305);
        Number_10 number_10 = new Number_10();
        addObject(number_10, 659, 312);
        Number_11 number_11 = new Number_11();
        addObject(number_11, 767, 312);
        Number_12 number_12 = new Number_12();
        addObject(number_12, 872, 315);
        number_9.setLocation(552, 298);
        number_10.setLocation(650, 300);
        number_11.setLocation(747, 299);
        number_12.setLocation(843, 302);
        Number_13 number_13 = new Number_13();
        addObject(number_13, 950, 306);
        number_13.setLocation(942, 303);
        Combo1And2 combo1and2 = new Combo1And2();
        addObject(combo1and2, 173, 478);
        Combo5And6 combo5and6 = new Combo5And6();
        addObject(combo5and6, 948, 480);
        combo1and2.setLocation(149, 467);
        combo5and6.setLocation(948, 472);

        Number_14 number_14 = new Number_14();
        addObject(number_14, 1046, 311);
        number_14.setLocation(1039, 303);
        Number_15 number_15 = new Number_15();
        addObject(number_15, 1145, 308);
        number_15.setLocation(1138, 303);
        Number_16 number_16 = new Number_16();
        addObject(number_16, 1245, 310);
        number_16.setLocation(1238, 305);
        Number_17 number_17 = new Number_17();
        addObject(number_17, 1342, 309);
        number_17.setLocation(1336, 303);
        big.setLocation(1277, 101);
        big.setLocation(1283, 104);
        small.setLocation(114, 101);
        big.setLocation(1287, 101);
        combo1and2.setLocation(162, 467);
        combo5and6.setLocation(943, 472);
        Combo1And2 combo1and22 = new Combo1And2();
        addObject(combo1and22, 1237, 683);
        removeObject(combo1and22);
        TwoDie twodie = new TwoDie();
        addObject(twodie, 76, 467);
        Combo1And3 combo1and3 = new Combo1And3();
        addObject(combo1and3, 251, 475);
        combo1and3.setLocation(243, 469);
        Combo1And4 combo1and4 = new Combo1And4();
        addObject(combo1and4, 331, 476);
        combo1and4.setLocation(325, 469);
        Combo1And5 combo1and5 = new Combo1And5();
        addObject(combo1and5, 409, 477);
        combo1and5.setLocation(402, 468);
        Combo1And6 combo1and6 = new Combo1And6();
        addObject(combo1and6, 493, 475);
        combo1and6.setLocation(487, 469);
        combo1and5.setLocation(404, 470);
        combo1and6.setLocation(486, 470);
        Combo2And3 combo2and3 = new Combo2And3();
        addObject(combo2and3, 570, 473);
        combo2and3.setLocation(565, 470);
        Combo2And4 combo2and4 = new Combo2And4();
        addObject(combo2and4, 653, 476);
        combo2and4.setLocation(646, 470);
        Combo2And6 combo2and6 = new Combo2And6();
        addObject(combo2and6, 824, 479);
        Combo2And5 combo2and5 = new Combo2And5();
        addObject(combo2and5, 734, 480);
        combo2and5.setLocation(726, 471);
        combo2and6.setLocation(802, 471);
        Combo3And4 combo3and4 = new Combo3And4();
        addObject(combo3and4, 885, 478);
        combo5and6.setLocation(1039, 472);
        combo3and4.setLocation(883, 472);
        combo2and5.setLocation(726, 471);
        Combo1And5 combo1and52 = new Combo1And5();
        addObject(combo1and52, 1233, 659);
        removeObject(combo1and52);
        Combo3And6 combo3and6 = new Combo3And6();
        addObject(combo3and6, 968, 478);
        combo3and6.setLocation(961, 471);
        combo5and6.setLocation(1305, 478);
        Combo4And6 combo4and6 = new Combo4And6();
        addObject(combo4and6, 1131, 481);
        combo5and6.setLocation(1211, 474);
        combo4and6.setLocation(1130, 477);
        Combo4And5 combo4and5 = new Combo4And5();
        addObject(combo4and5, 1049, 479);
        combo4and5.setLocation(1040, 473);
        combo4and6.setLocation(1118, 474);
        combo5and6.setLocation(1196, 473);
        combo1and2.setLocation(162, 467);
        combo2and5.setLocation(726, 475);
        combo3and6.setLocation(961, 473);
        combo3and4.setLocation(883, 474);
        combo2and6.setLocation(805, 473);
        combo3and6.setLocation(961, 473);
        combo5and6.setLocation(1197, 472);
        Combo1And1 combo1and1 = new Combo1And1();
        addObject(combo1and1, 274, 131);
        Combo2And2 combo2and2 = new Combo2And2();
        addObject(combo2and2, 368, 140);
        combo2and2.setLocation(363, 131);
        Combo3And3 combo3and3 = new Combo3And3();
        addObject(combo3and3, 459, 137);
        combo3and3.setLocation(454, 132);
        OneWinsEleven onewinseleven = new OneWinsEleven();
        addObject(onewinseleven, 1038, 736);
        removeObject(onewinseleven);
        EachDoubleOneWinsEleven eachdoubleonewinseleven = new EachDoubleOneWinsEleven();
        addObject(eachdoubleonewinseleven, 363, 38);
        eachdoubleonewinseleven.setLocation(360, 33);
        Combo6And6 combo6and6 = new Combo6And6();
        addObject(combo6and6, 1136, 130);
        number_15.setLocation(1136, 298);
        number_16.setLocation(1235, 299);
        number_17.setLocation(1330, 300);
        number_14.setLocation(1039, 298);
        number_13.setLocation(942, 295);
        number_12.setLocation(842, 296);
        number_11.setLocation(748, 294);
        number_12.setLocation(844, 296);
        number_10.setLocation(650, 295);
        number_8.setLocation(456, 297);
        combo2and3.setLocation(564, 468);
        combo2and4.setLocation(646, 467);
        combo2and5.setLocation(726, 470);
        combo2and6.setLocation(804, 471);
        combo3and4.setLocation(883, 472);
        combo3and6.setLocation(960, 469);
        combo4and5.setLocation(1039, 468);
        combo4and6.setLocation(1118, 468);
        combo4and5.setLocation(1039, 468);
        combo5and6.setLocation(1198, 467);
        Combo5And5 combo5and5 = new Combo5And5();
        addObject(combo5and5, 1042, 136);
        combo5and5.setLocation(1043, 132);
        Combo4And4 combo4and4 = new Combo4And4();
        addObject(combo4and4, 950, 136);
        combo4and4.setLocation(949, 133);
        combo4and4.setLocation(950, 130);
        EachDoubleOneWinsEleven eachdoubleonewinseleven2 = new EachDoubleOneWinsEleven();
        addObject(eachdoubleonewinseleven2, 1054, 35);
        eachdoubleonewinseleven2.setLocation(1041, 33);
        combo2and4.setLocation(646, 470);
        combo2and5.setLocation(728, 473);
        combo3and6.setLocation(961, 469);
        combo4and5.setLocation(1040, 471);
        combo4and6.setLocation(1119, 471);
        combo5and6.setLocation(1198, 470);
        SicBoTiles tiles = new SicBoTiles();
        Dice dice_1 = new Dice_1();
        dice_1.addObserver(tiles);
        addObject(dice_1, 570, 139);
        dice_1.setLocation(568, 140);
        Dice dice_2 = new Dice_2();
        dice_2.addObserver(tiles);
        addObject(dice_2, 684, 150);
        dice_2.setLocation(679, 146);
        dice_2.setLocation(678, 145);
        Dice dice_3 = new Dice_3();
        dice_3.addObserver(tiles);
        addObject(dice_3, 828, 145);
        dice_2.setLocation(686, 130);
        dice_1.setLocation(587, 125);
        dice_3.setLocation(799, 130);
        dice_2.setLocation(693, 129);
        dice_3.setLocation(811, 129);
        dice_2.setLocation(699, 129);
        dice_3.setLocation(820, 129);
        dice_2.setLocation(704, 128);
        Triple triple = new Triple();
        addObject(triple, 49, 605);
        triple.setLocation(359, 752);

        dice_3.setLocation(819, 125);
        dice_2.setLocation(704, 127);
        dice_1.setLocation(588, 124);
        dice_1.setLocation(589, 139);
        dice_2.setLocation(704, 144);
        dice_3.setLocation(818, 144);
        SingleValue_1 singlevalue_1 = new SingleValue_1();
        addObject(singlevalue_1, 215, 645);
        singlevalue_1.setLocation(201, 589);
        SingleValue_2 singlevalue_2 = new SingleValue_2();
        addObject(singlevalue_2, 392, 593);
        singlevalue_2.setLocation(384, 589);
        singlevalue_2.setLocation(384, 588);
        SingleValue_3 singlevalue_3 = new SingleValue_3();
        addObject(singlevalue_3, 574, 598);
        singlevalue_3.setLocation(567, 592);
        singlevalue_2.setLocation(385, 592);
        singlevalue_1.setLocation(201, 595);
        SingleValue_4 singlevalue_4 = new SingleValue_4();
        addObject(singlevalue_4, 760, 599);
        singlevalue_4.setLocation(749, 592);
        SingleValue_5 singlevalue_5 = new SingleValue_5();
        addObject(singlevalue_5, 947, 596);
        singlevalue_5.setLocation(934, 592);
        SingleValue_6 singlevalue_6 = new SingleValue_6();
        addObject(singlevalue_6, 1134, 598);
        singlevalue_6.setLocation(1120, 590);
        singlevalue_2.setLocation(387, 594);
        singlevalue_3.setLocation(569, 593);
        singlevalue_4.setLocation(755, 593);
        singlevalue_6.setLocation(1141, 590);
        singlevalue_5.setLocation(944, 592);
        singlevalue_6.setLocation(1134, 593);
        singlevalue_3.setLocation(570, 596);
        singlevalue_5.setLocation(961, 789);
        singlevalue_4.setLocation(722, 766);
        singlevalue_3.setLocation(494, 754);
        singlevalue_2.setLocation(326, 758);
        singlevalue_6.setLocation(1145, 593);
        singlevalue_4.setLocation(714, 629);
        singlevalue_5.setLocation(955, 595);
        singlevalue_4.setLocation(762, 595);
        singlevalue_3.setLocation(574, 596);
        singlevalue_2.setLocation(389, 596);
        singlevalue_4.setLocation(763, 597);
        singlevalue_5.setLocation(956, 596);
        singlevalue_6.setLocation(1144, 594);
        OneIsToOne oneistoone = new OneIsToOne();
        addObject(oneistoone, 306, 678);
        oneistoone.setLocation(299, 671);
        TwoIsToOne twoistoone = new TwoIsToOne();
        addObject(twoistoone, 680, 678);
        twoistoone.setLocation(677, 671);
        ThreeIsToOne threeistoone = new ThreeIsToOne();
        addObject(threeistoone, 1060, 676);
        threeistoone.setLocation(1054, 670);
        IPlayer nobody = new Nobody();
        Display disp = new Display(nobody);
        ScoreBoard scoreboard = new ScoreBoard(disp);
        addObject(scoreboard, 701, 824);
        //Reset reset=new Reset();
        //addObject(reset,1073, 824);
        Combo3And5 combo3and5 = new Combo3And5();
        addObject(combo3and5, 1348, 597);
        combo4and5.setLocation(1339, 471);
        combo3and6.setLocation(1047, 470);
        combo3and5.setLocation(965, 472);
        combo5and6.setLocation(1258, 468);
        combo4and6.setLocation(1179, 469);
        combo4and5.setLocation(1130, 470);
        combo4and6.setLocation(1187, 469);
        combo5and6.setLocation(1305, 472);
        combo4and5.setLocation(1126, 471);
        combo4and6.setLocation(1205, 473);
        combo5and6.setLocation(1285, 472);
        triple.setLocation(650, 418);
        triple.setLocation(700, 154);
        //NumberInputBox1 numberinputbox1 = new NumberInputBox1();
        //addObject(numberinputbox1, 106, 745);
        //NumberInputBox2 numberinputbox2 = new NumberInputBox2();
        //addObject(numberinputbox2, 304, 753);
        //numberinputbox2.setLocation(309, 749);
        //numberinputbox2.setLocation(311, 746);
        CreateChip1 createchip1 = new CreateChip1();
        addObject(createchip1, 120, 846);
        CreateChip2 createchip2 = new CreateChip2();
        addObject(createchip2, 395, 847);
        //numberinputbox2.setLocation(383, 749);
        //numberinputbox1.setLocation(116, 748);
        NumberInputBox numberinputbox = new NumberInputBox();
        addObject(numberinputbox, 168, 749);
        numberinputbox.setLocation(253, 742);
        dice_1.setLocation(581, 53);
        dice_2.setLocation(695, 53);
        dice_3.setLocation(809, 53);
        /*dice_1.setLocation(785, 362);
        dice_1.setLocation(906, 851);
        dice_3.setLocation(766, 440);
        triple.setLocation(690, 119);
        triple.setLocation(697, 114);
        //reset.setLocation(1216, 721);
        dice_2.setLocation(1061, 843);
        dice_3.setLocation(1150, 828);
        dice_1.setLocation(906, 821);
        dice_2.setLocation(1019, 825);
        dice_3.setLocation(1130, 821);
        dice_3.setLocation(1130, 825);*/
        numberinputbox.setLocation(262, 771);
        createchip2.setLocation(437, 848);
        scoreboard.setLocation(842, 823);
        createchip2.setLocation(480, 853);
        numberinputbox.setLocation(324, 770);
        createchip2.setLocation(531, 843);
        scoreboard.setLocation(878, 814);

        removeObject(oneistoone);
        removeObject(twoistoone);
        removeObject(threeistoone);
        numberinputbox.setLocation(676, 690);
        scoreboard.setLocation(702, 809);

        createchip2.setLocation(1207, 817);
        scoreboard.setLocation(679, 805);
        createchip1.setLocation(156, 804);
        createchip2.setLocation(1203, 791);
        createchip2.setLocation(1199, 794);
        createchip1.setLocation(157, 795);
        createchip2.setLocation(1200, 797);
        createchip2.setLocation(1199, 793);
        createchip2.setLocation(1199, 795);
        Dice.pScoreOne=0;
        Dice.pScoreTwo=0;
    }
    
     public void createWorld()
    {
    //  Greenfoot.setWorld(new GameOver());  
    }
    
    public void act()
    {
         
    }
}
