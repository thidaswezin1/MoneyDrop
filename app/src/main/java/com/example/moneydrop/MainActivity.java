package com.example.moneydrop;

import android.os.Bundle;
import android.view.View.OnClickListener;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	DatabaseHelper db;Button btn1,btn2,btn3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		db = new DatabaseHelper(getApplicationContext());
		btn1=(Button)findViewById(R.id.button1);
		btn2=(Button)findViewById(R.id.button2);
		btn3=(Button)findViewById(R.id.button3);
		btn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				onCreateCategory();
			}
		});
		btn2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				onCreateQuestion();
			}
		});
		btn3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				onCreateFalseAnswer();
			}
		});
	}
	public void onCreateCategory(){
		Category cat1=new Category("Flowers","1");
		Category cat2=new Category("Literature","1");
		Category cat3=new Category("History of Myanmar","1");
		Category cat4=new Category("Festivals","1");
		Category cat5=new Category("Days","1");
		Category cat6=new Category("Music","1");
		Category cat7=new Category("Movie","1");
		Category cat8=new Category("Cities","1");
		Category cat9=new Category("Sports","1");
		Category cat10=new Category("Beauty","1");
		Category cat11=new Category("Zoology","2");
		Category cat12=new Category("Health","2");
		Category cat13=new Category("Famous Persons","2");
		Category cat14=new Category("Famous Places","2");
		Category cat15=new Category("Cars","2");
		Category cat16=new Category("IT","2");
		Category cat17=new Category("General Knowledge-1","2");
		Category cat18=new Category("Science","2");
		Category cat19=new Category("General Knowledge-2","3");
		Category cat20=new Category("Computer","3");
		Category cat21=new Category("History of world","3");
		
		db.createCategory(cat1);
		db.createCategory(cat2);
		db.createCategory(cat3);
		db.createCategory(cat4);
		db.createCategory(cat5);
		db.createCategory(cat6);
		db.createCategory(cat7);
		db.createCategory(cat8);
		db.createCategory(cat9);
		db.createCategory(cat10);
		db.createCategory(cat11);
		db.createCategory(cat12);
		db.createCategory(cat13);
		db.createCategory(cat14);
		db.createCategory(cat15);
		db.createCategory(cat16);
		db.createCategory(cat17);
		db.createCategory(cat18);
		db.createCategory(cat19);
		db.createCategory(cat20);
		db.createCategory(cat21);
	}
		public void onCreateQuestion(){
			QuestionAndCorrectAnswer correct1=new QuestionAndCorrectAnswer("Which flower has the smallest seeds?", 1, "Orchid");
			QuestionAndCorrectAnswer correct2=new QuestionAndCorrectAnswer("Which is the biggest flower of the world?", 1, "Rafflasia");
			QuestionAndCorrectAnswer correct3=new QuestionAndCorrectAnswer("What is the state flower of New York?", 1, "Rose");
			QuestionAndCorrectAnswer correct4=new QuestionAndCorrectAnswer("Carnation flowers are the national symbol of what country?", 1, "Slovenia");
			QuestionAndCorrectAnswer correct5=new QuestionAndCorrectAnswer("The disc of this flower is made up of hundreds of tiny flowers?", 1, "Daisy");
		
			QuestionAndCorrectAnswer correct6=new QuestionAndCorrectAnswer("What was the nationality of Robert Louis Stevenson, writer of 'Treasure Island'?", 2, "Scottish");
			QuestionAndCorrectAnswer correct7=new QuestionAndCorrectAnswer("Which is the first Harry Potter book?", 2, "HP and the Philosopher's Stone");
			QuestionAndCorrectAnswer correct8=new QuestionAndCorrectAnswer("Who was the author of the famous storybook 'Alice's Adventures in Wonderland'?", 2, "Lewis Carroll");
			QuestionAndCorrectAnswer correct9=new QuestionAndCorrectAnswer("Who wrote the famous 1855 poem 'The Charge of the Light Brigade'?", 2, "Lord Alfred Tennyson");
			QuestionAndCorrectAnswer correct10=new QuestionAndCorrectAnswer("Name the book which opens with the line 'All children, except one grew up'?", 2, "Peter Pan");
			
			QuestionAndCorrectAnswer correct11=new QuestionAndCorrectAnswer("What was the oldest civilization in Myanmar?", 3, "Pyu");
			QuestionAndCorrectAnswer correct12=new QuestionAndCorrectAnswer("Myanmar has had many capitals, but when British ruled the country, what was the capital?", 3, "Yangon");
			QuestionAndCorrectAnswer correct13=new QuestionAndCorrectAnswer("In which year did Myanmar gain independence from the British?", 3, "1948");
			QuestionAndCorrectAnswer correct14=new QuestionAndCorrectAnswer("In Myanmar, 19 July is _________.", 3, "Martyrs' Day");
			QuestionAndCorrectAnswer correct15=new QuestionAndCorrectAnswer("Myanmar is a country located between Thailand and _________.", 3, "Bangladesh");
			
			QuestionAndCorrectAnswer correct16=new QuestionAndCorrectAnswer("The annual Holi Festival is celebrated in ________.", 4, "India");
			QuestionAndCorrectAnswer correct17=new QuestionAndCorrectAnswer("Snowbombing is the biggest party on the snow held in Mayrhofen, _______.", 4, "Austria");
			QuestionAndCorrectAnswer correct18=new QuestionAndCorrectAnswer("La Tomatina (Tomato Throwing Festival) held on the last Wednesday of August each year in________.", 4, "Spain");
			QuestionAndCorrectAnswer correct19=new QuestionAndCorrectAnswer("Running of the bulls is a festival held in _______.", 4, "Spain");
			QuestionAndCorrectAnswer correct20=new QuestionAndCorrectAnswer("The Albuquerque International Balloon Fiesta is a yearly festival of hot air balloons that takes place in ______.", 4, "New Mexico");
			
			QuestionAndCorrectAnswer correct21=new QuestionAndCorrectAnswer("The day of World’s Blood Donation is _______.", 5, "August 14");
			QuestionAndCorrectAnswer correct22=new QuestionAndCorrectAnswer("The day when Pin Lon content is made was ________.", 5, "February 12");
			QuestionAndCorrectAnswer correct23=new QuestionAndCorrectAnswer("'Peasants Day' in Myanmar is ________.", 5, "March 2");
			QuestionAndCorrectAnswer correct24=new QuestionAndCorrectAnswer("'National Day' is the day that the first university students strike in ______.", 5, "1920");
			QuestionAndCorrectAnswer correct25=new QuestionAndCorrectAnswer("Holiday of Hindu Festival of Light Day is called _____.", 5, "Diwali Day");
			
			QuestionAndCorrectAnswer correct26=new QuestionAndCorrectAnswer("Singer of 'My heart will go on' is _______.", 6, "Celine Dion");
			QuestionAndCorrectAnswer correct27=new QuestionAndCorrectAnswer("Guitarist of 'Iron Cross' music band is ________.", 6, "Chit San Maung");
			QuestionAndCorrectAnswer correct28=new QuestionAndCorrectAnswer("Singer of 'Marry You' song is _______.", 6, "Bruno Mars");
			QuestionAndCorrectAnswer correct29=new QuestionAndCorrectAnswer("The first song of 'One Direction' is ________.", 6, "What Makes You Beautiful");
			QuestionAndCorrectAnswer correct30=new QuestionAndCorrectAnswer("Singer of 'Wrecking Ball' is _______.", 6, "Miley Cyrus");
			
			QuestionAndCorrectAnswer correct31=new QuestionAndCorrectAnswer("The director of 'Titanic' is _______.", 7, "James Cameron");
			QuestionAndCorrectAnswer correct32=new QuestionAndCorrectAnswer("'Thingyan Moe' is directed by ______.", 7, "Maung Tin Oo");
			QuestionAndCorrectAnswer correct33=new QuestionAndCorrectAnswer("Actor who was received Acadamy in 'YinHteKaSaungYarThi' movie is_______.", 7, "Lwin Moe");
			QuestionAndCorrectAnswer correct34=new QuestionAndCorrectAnswer("The director of 'Twilight' is _______.", 7, "Helen Catherine Hardwicke");
			QuestionAndCorrectAnswer correct35=new QuestionAndCorrectAnswer("The name of Princess in 'Brave' movie is _______.", 7, "Merida");
			
			QuestionAndCorrectAnswer correct36=new QuestionAndCorrectAnswer("The capital of India is _______.", 8, "Delhi");
			QuestionAndCorrectAnswer correct37=new QuestionAndCorrectAnswer("The capital of Germany is ________.", 8, "Berlin");
			QuestionAndCorrectAnswer correct38=new QuestionAndCorrectAnswer("The Fuji Mountain locates on  ________, in Japan.", 8, "Honshu Island");
			QuestionAndCorrectAnswer correct39=new QuestionAndCorrectAnswer("The capital of Malaysia is _________.", 8, "Kuala Lumpur");
			QuestionAndCorrectAnswer correct40=new QuestionAndCorrectAnswer("The historical city of Vietnam is _______.", 8, "Ho Chi Minh");
			
			QuestionAndCorrectAnswer correct41=new QuestionAndCorrectAnswer("The full name of SEA game is _______.", 9, "Southeast Asian Game");
			QuestionAndCorrectAnswer correct42=new QuestionAndCorrectAnswer("Country of the first SEA game held in  _________.", 9, "Thailand");
			QuestionAndCorrectAnswer correct43=new QuestionAndCorrectAnswer("Country that didn't held SEA game until now is _______.", 9, "Cambodia");
			QuestionAndCorrectAnswer correct44=new QuestionAndCorrectAnswer("How many interwined rings in Olymoic flag?", 9, "five");
			QuestionAndCorrectAnswer correct45=new QuestionAndCorrectAnswer("The first modern Olympic were held in ______.", 9, "Greek");

			QuestionAndCorrectAnswer correct46=new QuestionAndCorrectAnswer("The term 'pigment' refers to_________", 10, "Color");
			QuestionAndCorrectAnswer correct47=new QuestionAndCorrectAnswer("If skin is described as 'sallow', the skin is", 10, "Yellowish");
			QuestionAndCorrectAnswer correct48=new QuestionAndCorrectAnswer("Which of the following may attract the sun's UV rays to your lips?", 10, "High-gloss sheer lipstick");
			QuestionAndCorrectAnswer correct49=new QuestionAndCorrectAnswer("Identify the proper order for facial cleansing.", 10, "Cleanse, tone, and moisturize");
			QuestionAndCorrectAnswer correct50=new QuestionAndCorrectAnswer("In terms of beauty, the forehead, nose, and chin are referred to as the _______.", 10, "T-zone");
			 
			QuestionAndCorrectAnswer correct51=new QuestionAndCorrectAnswer("Number of bones in human body is", 11, "206");
			QuestionAndCorrectAnswer correct52=new QuestionAndCorrectAnswer("Birds excrete nitrogenous waste in the form of", 11, "Uric Acid");
			QuestionAndCorrectAnswer correct53=new QuestionAndCorrectAnswer("In scorpion, poison is present in the", 11, "Sting");
			QuestionAndCorrectAnswer correct54=new QuestionAndCorrectAnswer("Night blindness is caused due to deficiency of", 11, "Vitamin A");
			QuestionAndCorrectAnswer correct55=new QuestionAndCorrectAnswer("The escape of haemoglobin from RBC is known as", 11, "Thermolysis");
			
			QuestionAndCorrectAnswer correct56=new QuestionAndCorrectAnswer("In which country was the first ambulance used?", 12, "France");
			QuestionAndCorrectAnswer correct57=new QuestionAndCorrectAnswer("In which part of the body is a human's longest bone?", 12, "Thigh");
			QuestionAndCorrectAnswer correct58=new QuestionAndCorrectAnswer("What does the S stand for in AIDS?", 12, "Syndrome");
			QuestionAndCorrectAnswer correct59=new QuestionAndCorrectAnswer("Which gland produces the hormones that control the body’s metabolism?", 12, "Thyroid");
			QuestionAndCorrectAnswer correct60=new QuestionAndCorrectAnswer("Which organ produces insulin?", 12, "Pancreas");
			
			QuestionAndCorrectAnswer correct61=new QuestionAndCorrectAnswer("_______ was a Roman Catholic nun who devoted her life to serving the poor and destitute around the world", 13, "Mother Teresa");
			QuestionAndCorrectAnswer correct62=new QuestionAndCorrectAnswer("Aung San Su Kyi was born in _________.", 13, "19 June 1945");
			QuestionAndCorrectAnswer correct63=new QuestionAndCorrectAnswer("Only Englishman to score in three different World's cups is _______.", 13, "David Beckham");
			QuestionAndCorrectAnswer correct64=new QuestionAndCorrectAnswer("The 44th President of US from 2009 to 2017 was ________.", 13, "Barack Obama");
			QuestionAndCorrectAnswer correct65=new QuestionAndCorrectAnswer("The first President of United State was ________.", 13, "Geroge Washington");
			
			QuestionAndCorrectAnswer correct66=new QuestionAndCorrectAnswer("The oldest and longest teakwood bridge around the world is _______.", 14, "U Bein Bridge");
			QuestionAndCorrectAnswer correct67=new QuestionAndCorrectAnswer("The longest river in Myanmar is ______. ", 14, "Mekong River");
			QuestionAndCorrectAnswer correct68=new QuestionAndCorrectAnswer("The longest river around the world is _______.", 14, "Nile River");
			QuestionAndCorrectAnswer correct69=new QuestionAndCorrectAnswer("ShinKoeShin Pagodas are located in ________.", 14, "Tanintharyi Division");
			QuestionAndCorrectAnswer correct70=new QuestionAndCorrectAnswer("Rih Lake is located in ________, Chin State.", 14, "HarKhar");
			
			QuestionAndCorrectAnswer correct71=new QuestionAndCorrectAnswer("'Land Cruiser' is made in ________.", 15,"Japan");
			QuestionAndCorrectAnswer correct72=new QuestionAndCorrectAnswer("The production year of 'Pajero' was _________.", 15, "1982");
			QuestionAndCorrectAnswer correct73=new QuestionAndCorrectAnswer("Mercedes-Benz is made in which country?", 15, "Germany");
			QuestionAndCorrectAnswer correct74=new QuestionAndCorrectAnswer("The latest car model of Toyota is _________.", 15, "Avalon");
			QuestionAndCorrectAnswer correct75=new QuestionAndCorrectAnswer("'BMW' is made in ________.", 15, "North America");
			
			QuestionAndCorrectAnswer correct76=new QuestionAndCorrectAnswer("The CRU comprises of control, memory and _______ units.", 16, "Arithmetic/logic");
			QuestionAndCorrectAnswer correct77=new QuestionAndCorrectAnswer("Who among the following is considered as the inventor of the World Wide Web(WWW)?", 16, "Tim Berners-Lee");
			QuestionAndCorrectAnswer correct78=new QuestionAndCorrectAnswer("Which one of the following devices is not the Input device of a computer?", 16, "Plotters");
			QuestionAndCorrectAnswer correct79=new QuestionAndCorrectAnswer("Which one of the following can make it easier to play games?", 16, "Joystick");
			QuestionAndCorrectAnswer correct80=new QuestionAndCorrectAnswer("Which one of the following computer memory is a temporary and volatile?", 16, "RAM");
			
			QuestionAndCorrectAnswer correct81=new QuestionAndCorrectAnswer("The rare black roses can only be found in ___________.", 17, "Turkey");
			QuestionAndCorrectAnswer correct82=new QuestionAndCorrectAnswer("How long did the World War II take place?", 17, "6 years and 1 day");
			QuestionAndCorrectAnswer correct83=new QuestionAndCorrectAnswer("Hkakabo Razi mountain is in the _______ of Myanmar.", 17, "Kachin State");
			QuestionAndCorrectAnswer correct84=new QuestionAndCorrectAnswer("The height of Shwedagon Pagoda is ________.", 17, "325ft");
			QuestionAndCorrectAnswer correct85=new QuestionAndCorrectAnswer("The second longest bridge in Myanmar is _________.", 17, "Thanlwin  Bridge");
			
			QuestionAndCorrectAnswer correct86=new QuestionAndCorrectAnswer("Entomology is the science that studies ___________.", 18, "Insects");
			QuestionAndCorrectAnswer correct87=new QuestionAndCorrectAnswer("Which of the following parts of the sun is easily visible only during a total solar eclipse?", 18, "corona");
			QuestionAndCorrectAnswer correct88=new QuestionAndCorrectAnswer("Pollination by birds is called _______ .", 18, "ornithophily");
			QuestionAndCorrectAnswer correct89=new QuestionAndCorrectAnswer("The study of phenomena at very low temperature is called ________.", 18, "cryogenics");
			QuestionAndCorrectAnswer correct90=new QuestionAndCorrectAnswer("Which prefix is used with scientific terms to indicate that something is same,equal or constant? ", 18, "iso");
			
			QuestionAndCorrectAnswer correct91=new QuestionAndCorrectAnswer("Logarithm tables were invented by ___________.", 19, "John Napier");
			QuestionAndCorrectAnswer correct92=new QuestionAndCorrectAnswer("In which year of First World War Germany declared war on Russia and France?", 19, "1914");
			QuestionAndCorrectAnswer correct93=new QuestionAndCorrectAnswer("Cystitics is the inflection of which of the following?", 19, "urinary bladder");
			QuestionAndCorrectAnswer correct94=new QuestionAndCorrectAnswer("The first news paper in the world was started by ________.", 19, "China");
			QuestionAndCorrectAnswer correct95=new QuestionAndCorrectAnswer("Who is known as Man of Blood and Iron?", 19, "Bismarck");
			
			QuestionAndCorrectAnswer correct96=new QuestionAndCorrectAnswer("Which of the following is an example of an optical disk?", 20, "Digital versatile disk");
			QuestionAndCorrectAnswer correct97=new QuestionAndCorrectAnswer("IC chips used in computers are made of _________.", 20, "Silicon");
			QuestionAndCorrectAnswer correct98=new QuestionAndCorrectAnswer("Which supercomputer is developed by the Indian Scientists?", 20, "Param");
			QuestionAndCorrectAnswer correct99=new QuestionAndCorrectAnswer("Free of cost repair of software bug available at internet is called _________.", 20, "Patch");
			QuestionAndCorrectAnswer correct100=new QuestionAndCorrectAnswer("The founder of Netscape Communications is _________.", 20, "Marc Andreessen");
			
			
			QuestionAndCorrectAnswer correct101=new QuestionAndCorrectAnswer("Rome was founded in the year ___________.", 21, "753 BC");
			QuestionAndCorrectAnswer correct102=new QuestionAndCorrectAnswer("The first battle of which war was the Battle of Alma?", 21, "Cremean war");
			QuestionAndCorrectAnswer correct103=new QuestionAndCorrectAnswer("Who is considered the Father of the Constitution?", 21, "James Madison");
			QuestionAndCorrectAnswer correct104=new QuestionAndCorrectAnswer("During which war in 1870 was the Battle of Sedan foughts?", 21, "Franco Prussian war");
			QuestionAndCorrectAnswer correct105=new QuestionAndCorrectAnswer("Greek civilization was florished in the year___________.", 21, "800 BC");
			
			db.createQuestionAndCorrectAnswer(correct1);
			db.createQuestionAndCorrectAnswer(correct2);
			db.createQuestionAndCorrectAnswer(correct3);
			db.createQuestionAndCorrectAnswer(correct4);
			db.createQuestionAndCorrectAnswer(correct5);
			db.createQuestionAndCorrectAnswer(correct6);
			db.createQuestionAndCorrectAnswer(correct7);
			db.createQuestionAndCorrectAnswer(correct8);
			db.createQuestionAndCorrectAnswer(correct9);
			db.createQuestionAndCorrectAnswer(correct10);
			
			db.createQuestionAndCorrectAnswer(correct11);
			db.createQuestionAndCorrectAnswer(correct12);
			db.createQuestionAndCorrectAnswer(correct13);
			db.createQuestionAndCorrectAnswer(correct14);
			db.createQuestionAndCorrectAnswer(correct15);
			db.createQuestionAndCorrectAnswer(correct16);
			db.createQuestionAndCorrectAnswer(correct17);
			db.createQuestionAndCorrectAnswer(correct18);
			db.createQuestionAndCorrectAnswer(correct19);
			db.createQuestionAndCorrectAnswer(correct20);
			
			db.createQuestionAndCorrectAnswer(correct21);
			db.createQuestionAndCorrectAnswer(correct22);
			db.createQuestionAndCorrectAnswer(correct23);
			db.createQuestionAndCorrectAnswer(correct24);
			db.createQuestionAndCorrectAnswer(correct25);
			db.createQuestionAndCorrectAnswer(correct26);
			db.createQuestionAndCorrectAnswer(correct27);
			db.createQuestionAndCorrectAnswer(correct28);
			db.createQuestionAndCorrectAnswer(correct29);
			db.createQuestionAndCorrectAnswer(correct30);
			
			db.createQuestionAndCorrectAnswer(correct31);
			db.createQuestionAndCorrectAnswer(correct32);
			db.createQuestionAndCorrectAnswer(correct33);
			db.createQuestionAndCorrectAnswer(correct34);
			db.createQuestionAndCorrectAnswer(correct35);
			db.createQuestionAndCorrectAnswer(correct36);
			db.createQuestionAndCorrectAnswer(correct37);
			db.createQuestionAndCorrectAnswer(correct38);
			db.createQuestionAndCorrectAnswer(correct39);
			db.createQuestionAndCorrectAnswer(correct40);
			
			db.createQuestionAndCorrectAnswer(correct41);
			db.createQuestionAndCorrectAnswer(correct42);
			db.createQuestionAndCorrectAnswer(correct43);
			db.createQuestionAndCorrectAnswer(correct44);
			db.createQuestionAndCorrectAnswer(correct45);
			db.createQuestionAndCorrectAnswer(correct46);
			db.createQuestionAndCorrectAnswer(correct47);
			db.createQuestionAndCorrectAnswer(correct48);
			db.createQuestionAndCorrectAnswer(correct49);
			db.createQuestionAndCorrectAnswer(correct50);
			
			db.createQuestionAndCorrectAnswer(correct51);
			db.createQuestionAndCorrectAnswer(correct52);
			db.createQuestionAndCorrectAnswer(correct53);
			db.createQuestionAndCorrectAnswer(correct54);
			db.createQuestionAndCorrectAnswer(correct55);
			db.createQuestionAndCorrectAnswer(correct56);
			db.createQuestionAndCorrectAnswer(correct57);
			db.createQuestionAndCorrectAnswer(correct58);
			db.createQuestionAndCorrectAnswer(correct59);
			db.createQuestionAndCorrectAnswer(correct60);
			
			db.createQuestionAndCorrectAnswer(correct61);
			db.createQuestionAndCorrectAnswer(correct62);
			db.createQuestionAndCorrectAnswer(correct63);
			db.createQuestionAndCorrectAnswer(correct64);
			db.createQuestionAndCorrectAnswer(correct65);
			db.createQuestionAndCorrectAnswer(correct66);
			db.createQuestionAndCorrectAnswer(correct67);
			db.createQuestionAndCorrectAnswer(correct68);
			db.createQuestionAndCorrectAnswer(correct69);
			db.createQuestionAndCorrectAnswer(correct70);
			
			db.createQuestionAndCorrectAnswer(correct71);
			db.createQuestionAndCorrectAnswer(correct72);
			db.createQuestionAndCorrectAnswer(correct73);
			db.createQuestionAndCorrectAnswer(correct74);
			db.createQuestionAndCorrectAnswer(correct75);
			db.createQuestionAndCorrectAnswer(correct76);
			db.createQuestionAndCorrectAnswer(correct77);
			db.createQuestionAndCorrectAnswer(correct78);
			db.createQuestionAndCorrectAnswer(correct79);
			db.createQuestionAndCorrectAnswer(correct80);
			
			db.createQuestionAndCorrectAnswer(correct81);
			db.createQuestionAndCorrectAnswer(correct82);
			db.createQuestionAndCorrectAnswer(correct83);
			db.createQuestionAndCorrectAnswer(correct84);
			db.createQuestionAndCorrectAnswer(correct85);
			db.createQuestionAndCorrectAnswer(correct86);
			db.createQuestionAndCorrectAnswer(correct87);
			db.createQuestionAndCorrectAnswer(correct88);
			db.createQuestionAndCorrectAnswer(correct89);
			db.createQuestionAndCorrectAnswer(correct90);
			
			db.createQuestionAndCorrectAnswer(correct91);
			db.createQuestionAndCorrectAnswer(correct92);
			db.createQuestionAndCorrectAnswer(correct93);
			db.createQuestionAndCorrectAnswer(correct94);
			db.createQuestionAndCorrectAnswer(correct95);
			db.createQuestionAndCorrectAnswer(correct96);
			db.createQuestionAndCorrectAnswer(correct97);
			db.createQuestionAndCorrectAnswer(correct98);
			db.createQuestionAndCorrectAnswer(correct99);
			db.createQuestionAndCorrectAnswer(correct100);
			
			db.createQuestionAndCorrectAnswer(correct101);
			db.createQuestionAndCorrectAnswer(correct102);
			db.createQuestionAndCorrectAnswer(correct103);
			db.createQuestionAndCorrectAnswer(correct104);
			db.createQuestionAndCorrectAnswer(correct105);
	}
	public void onCreateFalseAnswer(){


		//level1_category1_false_answers
		
		FalseAnswer ans200=new FalseAnswer("Tulip",1);
		db.createFalseAnswer(ans200);
		FalseAnswer ans201=new FalseAnswer("Sweet Pea",1);
		db.createFalseAnswer(ans201);
		FalseAnswer ans202=new FalseAnswer("Daffodil",1);
		db.createFalseAnswer(ans202);
		
		FalseAnswer ans300=new FalseAnswer("Lili",2);
		db.createFalseAnswer(ans300);
		FalseAnswer ans301=new FalseAnswer("Rose",2);
		db.createFalseAnswer(ans301);
		FalseAnswer ans302=new FalseAnswer("Petunia",2);
		db.createFalseAnswer(ans302);
		
		FalseAnswer ans400=new FalseAnswer("Poppy",3);
		db.createFalseAnswer(ans400);
		FalseAnswer ans401=new FalseAnswer("Camellia",3);
		db.createFalseAnswer(ans401);
		FalseAnswer ans402=new FalseAnswer("Orange Blossom",3);
		db.createFalseAnswer(ans402);
		
		FalseAnswer ans500=new FalseAnswer("Bulgaria",4);
		db.createFalseAnswer(ans500);
		FalseAnswer ans501=new FalseAnswer("Belarus",4);
		db.createFalseAnswer(ans501);
		FalseAnswer ans502=new FalseAnswer("Croatia",4);
		db.createFalseAnswer(ans502);
		
		FalseAnswer ans600=new FalseAnswer("Anemone",5);
		db.createFalseAnswer(ans600);
		FalseAnswer ans601=new FalseAnswer("Gardenia",5);
		db.createFalseAnswer(ans601);
		FalseAnswer ans602=new FalseAnswer("Petunia",5);
		db.createFalseAnswer(ans602);
			

		//level1_category2_false_answers
		
		FalseAnswer ans700=new FalseAnswer("Irish",6);
		db.createFalseAnswer(ans700);
		FalseAnswer ans701=new FalseAnswer("French",6);
		db.createFalseAnswer(ans701);
		FalseAnswer ans702=new FalseAnswer("Welsh",6);
		db.createFalseAnswer(ans702);
		
		FalseAnswer ans703=new FalseAnswer("HP and the Goblash of Fire",7);
		db.createFalseAnswer(ans703);
		FalseAnswer ans704=new FalseAnswer("HP and the God of small Things",7);
		db.createFalseAnswer(ans704);
		FalseAnswer ans705=new FalseAnswer("HP and the Chamber of Secrets",7);
		db.createFalseAnswer(ans705);
		
		FalseAnswer ans706=new FalseAnswer("H G Wells",8);
		db.createFalseAnswer(ans706);
		FalseAnswer ans707=new FalseAnswer("John Keats",8);
		db.createFalseAnswer(ans707);
		FalseAnswer ans708=new FalseAnswer("Rudyard Kipling",8);
		db.createFalseAnswer(ans708);
		
		FalseAnswer ans709=new FalseAnswer("Christopher Marlowe",9);
		db.createFalseAnswer(ans709);
		FalseAnswer ans800=new FalseAnswer("Johannes Gutenberg",9);
		db.createFalseAnswer(ans800);
		FalseAnswer ans801=new FalseAnswer("Rene Descartes",9);
		db.createFalseAnswer(ans801);
		
		FalseAnswer ans802=new FalseAnswer("The Railway Children",10);
		db.createFalseAnswer(ans802);
		FalseAnswer ans803=new FalseAnswer("Winnie the Poo",10);
		db.createFalseAnswer(ans803);
		FalseAnswer ans804=new FalseAnswer("Jungle book",10);
		db.createFalseAnswer(ans804);
			

		//level1_category1_false_answers
		FalseAnswer ans1_1=new FalseAnswer("Bagan",11);
		db.createFalseAnswer(ans1_1);
		FalseAnswer ans1_2=new FalseAnswer("Inn Wa",11);
		db.createFalseAnswer(ans1_2);
		FalseAnswer ans1_3=new FalseAnswer("Pinn Ya",11);
		db.createFalseAnswer(ans1_3);
		
		FalseAnswer ans2_1=new FalseAnswer("Mandalay",12);
		db.createFalseAnswer(ans2_1);
		FalseAnswer ans2_2=new FalseAnswer("Nay Pyi Taw",12);
		db.createFalseAnswer(ans2_2);
		FalseAnswer ans2_3=new FalseAnswer("Sittwe",12);
		db.createFalseAnswer(ans2_3);
		
		FalseAnswer ans3_1=new FalseAnswer("1947",13);
		db.createFalseAnswer(ans3_1);
		FalseAnswer ans3_2=new FalseAnswer("1938",13);
		db.createFalseAnswer(ans3_2);
		FalseAnswer ans3_3=new FalseAnswer("1937",13);
		db.createFalseAnswer(ans3_3);
		
		FalseAnswer ans4_1=new FalseAnswer("Martrys' Day",14);
		db.createFalseAnswer(ans4_1);
		FalseAnswer ans4_2=new FalseAnswer("Martirs' Day",14);
		db.createFalseAnswer(ans4_2);
		FalseAnswer ans4_3=new FalseAnswer("Martys' Day",14);
		db.createFalseAnswer(ans4_3);

		FalseAnswer ans5_1=new FalseAnswer("Laos",15);
		db.createFalseAnswer(ans5_1);
		FalseAnswer ans5_2=new FalseAnswer("China",15);
		db.createFalseAnswer(ans5_2);
		FalseAnswer ans5_3=new FalseAnswer("India",15);
		db.createFalseAnswer(ans5_3);
		
		//level1_category2_false_answers
		
		FalseAnswer ans6_1=new FalseAnswer("Spain",16);
		db.createFalseAnswer(ans6_1);
		FalseAnswer ans6_2=new FalseAnswer("Norway",16);
		db.createFalseAnswer(ans6_2);
		FalseAnswer ans6_3=new FalseAnswer("Cambodia",16);
		db.createFalseAnswer(ans6_3);
		
		FalseAnswer ans7_1=new FalseAnswer("Korea",17);
		db.createFalseAnswer(ans7_1);
		FalseAnswer ans7_2=new FalseAnswer("Japan",17);
		db.createFalseAnswer(ans7_2);
		FalseAnswer ans7_3=new FalseAnswer("Russia",17);
		db.createFalseAnswer(ans7_3);
		
		FalseAnswer ans8_1=new FalseAnswer("India",18);
		db.createFalseAnswer(ans8_1);
		FalseAnswer ans8_2=new FalseAnswer("Norway",18);
		db.createFalseAnswer(ans8_2);
		FalseAnswer ans8_3=new FalseAnswer("France",18);
		db.createFalseAnswer(ans8_3);
		
		FalseAnswer ans9_1=new FalseAnswer("India",19);
		db.createFalseAnswer(ans9_1);
		FalseAnswer ans9_2=new FalseAnswer("Cambodia",19);
		db.createFalseAnswer(ans9_2);
		FalseAnswer ans9_3=new FalseAnswer("Vietnum",19);
		db.createFalseAnswer(ans9_3);
		
		FalseAnswer ans10_1=new FalseAnswer("New York",20);
		db.createFalseAnswer(ans10_1);
		FalseAnswer ans10_2=new FalseAnswer("England",20);
		db.createFalseAnswer(ans10_2);
		FalseAnswer ans10_3=new FalseAnswer("France",20);
		db.createFalseAnswer(ans10_3);
		
		//level1_category3_false_answers
		
		FalseAnswer ans11_1=new FalseAnswer("April 8",21);
		db.createFalseAnswer(ans11_1);
		FalseAnswer ans11_2=new FalseAnswer("January 4",21);
		db.createFalseAnswer(ans11_2);
		FalseAnswer ans11_3=new FalseAnswer("May 1",21);
		db.createFalseAnswer(ans11_3);
		
		FalseAnswer ans12_1=new FalseAnswer("February 13",22);
		db.createFalseAnswer(ans12_1);
		FalseAnswer ans12_2=new FalseAnswer("Jauary 4",22);
		db.createFalseAnswer(ans12_2);
		FalseAnswer ans12_3=new FalseAnswer("January 12",22);
		db.createFalseAnswer(ans12_3);
		
		FalseAnswer ans13_1=new FalseAnswer("May 1",23);
		db.createFalseAnswer(ans13_1);
		FalseAnswer ans13_2=new FalseAnswer("March 1",23);
		db.createFalseAnswer(ans13_2);
		FalseAnswer ans13_3=new FalseAnswer("May 2",23);
		db.createFalseAnswer(ans13_3);
		
		FalseAnswer ans14_1=new FalseAnswer("1926",24);
		db.createFalseAnswer(ans14_1);
		FalseAnswer ans14_2=new FalseAnswer("1921",24);
		db.createFalseAnswer(ans14_2);
		FalseAnswer ans14_3=new FalseAnswer("1985",24);
		db.createFalseAnswer(ans14_3);
		
		FalseAnswer ans15_1=new FalseAnswer("Christmas",25);
		db.createFalseAnswer(ans15_1);
		FalseAnswer ans15_2=new FalseAnswer("Holi Day",25);
		db.createFalseAnswer(ans15_2);
		FalseAnswer ans15_3=new FalseAnswer("Durga Purja",25);
		db.createFalseAnswer(ans15_3);
		
		//level1_category4_false_answers
		
		FalseAnswer ans16_1=new FalseAnswer("Miley Cyrus",26);
		db.createFalseAnswer(ans16_1);
		FalseAnswer ans16_2=new FalseAnswer("Christina Perri",26);
		db.createFalseAnswer(ans16_2);
		FalseAnswer ans16_3=new FalseAnswer("Britney Spears",26);
		db.createFalseAnswer(ans16_3);
		
		FalseAnswer ans17_1=new FalseAnswer("Aung Aung",27);
		db.createFalseAnswer(ans17_1);
		FalseAnswer ans17_2=new FalseAnswer("Zaw Myo Htut",27);
		db.createFalseAnswer(ans17_2);
		FalseAnswer ans17_3=new FalseAnswer("Naing Zaw",27);
		db.createFalseAnswer(ans17_3);
		
		FalseAnswer ans18_1=new FalseAnswer("Chris Brown",28);
		db.createFalseAnswer(ans18_1);
		FalseAnswer ans18_2=new FalseAnswer("Shayne Ward",28);
		db.createFalseAnswer(ans18_2);
		FalseAnswer ans18_3=new FalseAnswer("Jason Mraz",28);
		db.createFalseAnswer(ans18_3);
		
		FalseAnswer ans19_1=new FalseAnswer("One Thing",29);
		db.createFalseAnswer(ans19_1);
		FalseAnswer ans19_2=new FalseAnswer("Kiss You",29);
		db.createFalseAnswer(ans19_2);
		FalseAnswer ans19_3=new FalseAnswer("Come on Come on",29);
		db.createFalseAnswer(ans19_3);
		
		FalseAnswer ans20_1=new FalseAnswer("Shakira",30);
		db.createFalseAnswer(ans20_1);
		FalseAnswer ans20_2=new FalseAnswer("Jennifer Lopez",30);
		db.createFalseAnswer(ans20_2);
		FalseAnswer ans20_3=new FalseAnswer("Katy Perry",30);
		db.createFalseAnswer(ans20_3);
		
		//level1_category5_false_answers
		
		FalseAnswer ans21_1=new FalseAnswer("Lyle Wheeler",31);
		db.createFalseAnswer(ans21_1);
		FalseAnswer ans21_2=new FalseAnswer("Joseph B.Platt",31);
		db.createFalseAnswer(ans21_2);
		FalseAnswer ans21_3=new FalseAnswer("Eric G.Stacey",31);
		db.createFalseAnswer(ans21_3);
		
		FalseAnswer ans22_1=new FalseAnswer("Wine",32);
		db.createFalseAnswer(ans22_1);
		FalseAnswer ans22_2=new FalseAnswer("Mite Tee",32);
		db.createFalseAnswer(ans22_2);
		FalseAnswer ans22_3=new FalseAnswer("Mee Pwar",32);
		db.createFalseAnswer(ans22_3);
		
		FalseAnswer ans23_1=new FalseAnswer("Lu Min",33);
		db.createFalseAnswer(ans23_1);
		FalseAnswer ans23_2=new FalseAnswer("Kyaw Ye Aung",33);
		db.createFalseAnswer(ans23_2);
		FalseAnswer ans23_3=new FalseAnswer("Kyaw Thu",33);
		db.createFalseAnswer(ans23_3);
		
		FalseAnswer ans24_1=new FalseAnswer("Viorel Sergovici",34);
		db.createFalseAnswer(ans24_1);
		FalseAnswer ans24_2=new FalseAnswer("Mihai dorobantu",34);
		db.createFalseAnswer(ans24_2);
		FalseAnswer ans24_3=new FalseAnswer("Michael Damian",34);
		db.createFalseAnswer(ans24_3);
		
		FalseAnswer ans25_1=new FalseAnswer("Moana",35);
		db.createFalseAnswer(ans25_1);
		FalseAnswer ans25_2=new FalseAnswer("Arial",35);
		db.createFalseAnswer(ans25_2);
		FalseAnswer ans25_3=new FalseAnswer("Lilo",35);
		db.createFalseAnswer(ans25_3);
		
		//level1_category6_false_answers
		FalseAnswer ans26_1=new FalseAnswer("Mumbai",36);
		db.createFalseAnswer(ans26_1);
		FalseAnswer ans26_2=new FalseAnswer("Dubai",36);
		db.createFalseAnswer(ans26_2);
		FalseAnswer ans26_3=new FalseAnswer("Bangalore",36);
		db.createFalseAnswer(ans26_3);
		
		FalseAnswer ans27_1=new FalseAnswer("Munich",37);
		db.createFalseAnswer(ans27_1);
		FalseAnswer ans27_2=new FalseAnswer("Venice",37);
		db.createFalseAnswer(ans27_2);
		FalseAnswer ans27_3=new FalseAnswer("Frankfurt",37);
		db.createFalseAnswer(ans27_3);
		
		FalseAnswer ans28_1=new FalseAnswer("Toyokawa",38);
		db.createFalseAnswer(ans28_1);
		FalseAnswer ans28_2=new FalseAnswer("Tsushima",38);
		db.createFalseAnswer(ans28_2);
		FalseAnswer ans28_3=new FalseAnswer("Hirosaki",38);
		db.createFalseAnswer(ans28_3);
		
		FalseAnswer ans29_1=new FalseAnswer("George Town",39);
		db.createFalseAnswer(ans29_1);
		FalseAnswer ans29_2=new FalseAnswer("Ipoh",39);
		db.createFalseAnswer(ans29_2);
		FalseAnswer ans29_3=new FalseAnswer("Melaka",39);
		db.createFalseAnswer(ans29_3);
		
		FalseAnswer ans30_1=new FalseAnswer("Can Tho",40);
		db.createFalseAnswer(ans30_1);
		FalseAnswer ans30_2=new FalseAnswer("Ha Noi",40);
		db.createFalseAnswer(ans30_2);
		FalseAnswer ans30_3=new FalseAnswer("Hai Phong",40);
		db.createFalseAnswer(ans30_3);

		//level2_category7_false_answers
		FalseAnswer ans31_1=new FalseAnswer("Sports Electronic Archiving",41);
		db.createFalseAnswer(ans31_1);
		FalseAnswer ans31_2=new FalseAnswer("South East Area",41);
		db.createFalseAnswer(ans31_2);
		FalseAnswer ans31_3=new FalseAnswer("South East Artics",41);
		db.createFalseAnswer(ans31_3);
		
		FalseAnswer ans32_1=new FalseAnswer("Singapore",42);
		db.createFalseAnswer(ans32_1);
		FalseAnswer ans32_2=new FalseAnswer("Myanmar",42);
		db.createFalseAnswer(ans32_2);
		FalseAnswer ans32_3=new FalseAnswer("Laos",42);
		db.createFalseAnswer(ans32_3);
		
		
		FalseAnswer ans33_1=new FalseAnswer("Malaysia",43);
		db.createFalseAnswer(ans33_1);
		FalseAnswer ans33_2=new FalseAnswer("Thailand",43);
		db.createFalseAnswer(ans33_2);
		FalseAnswer ans33_3=new FalseAnswer("Singapore",43);
		db.createFalseAnswer(ans33_3);
		
		FalseAnswer ans34_1=new FalseAnswer("six",44);
		db.createFalseAnswer(ans34_1);
		FalseAnswer ans34_2=new FalseAnswer("four",44);
		db.createFalseAnswer(ans34_2);
		FalseAnswer ans34_3=new FalseAnswer("three",44);
		db.createFalseAnswer(ans34_3);

		FalseAnswer ans35_1=new FalseAnswer("Egypt",45);
		db.createFalseAnswer(ans35_1);
		FalseAnswer ans35_2=new FalseAnswer("Germany",45);
		db.createFalseAnswer(ans35_2);
		FalseAnswer ans35_3=new FalseAnswer("Singapore",45);
		db.createFalseAnswer(ans35_3);
		
		//level2_category8_false_answers
		
		FalseAnswer ans36_1=new FalseAnswer("Powder",46);
		db.createFalseAnswer(ans36_1);
		FalseAnswer ans36_2=new FalseAnswer("Tanning",46);
		db.createFalseAnswer(ans36_2);
		FalseAnswer ans36_3=new FalseAnswer("Toner",46);
		db.createFalseAnswer(ans36_3);
		
		FalseAnswer ans37_1=new FalseAnswer("Dry",47);
		db.createFalseAnswer(ans37_1);
		FalseAnswer ans37_2=new FalseAnswer("Sunburned",47);
		db.createFalseAnswer(ans37_2);
		FalseAnswer ans37_3=new FalseAnswer("Sunshined",47);
		db.createFalseAnswer(ans37_3);
		
		FalseAnswer ans38_1=new FalseAnswer("Lip balm",48);
		db.createFalseAnswer(ans38_1);
		FalseAnswer ans38_2=new FalseAnswer("Lip liner",48);
		db.createFalseAnswer(ans38_2);
		FalseAnswer ans38_3=new FalseAnswer("Lip color",48);
		db.createFalseAnswer(ans38_3);
		
		FalseAnswer ans39_1=new FalseAnswer("Tone, cleanse, and moisturize",49);
		db.createFalseAnswer(ans39_1);
		FalseAnswer ans39_2=new FalseAnswer("Moisturize, cleanse, and tone",49);
		db.createFalseAnswer(ans39_2);
		FalseAnswer ans39_3=new FalseAnswer("Moisturize, tone and clean",49);
		db.createFalseAnswer(ans39_3);
		
		FalseAnswer ans40_1=new FalseAnswer("Dry zone",50);
		db.createFalseAnswer(ans40_1);
		FalseAnswer ans40_2=new FalseAnswer("Oily zone",50);
		db.createFalseAnswer(ans40_2);
		FalseAnswer ans40_3=new FalseAnswer("Clear zone",50);
		db.createFalseAnswer(ans40_3);
		
		//level1_category2_false_answers
		
		FalseAnswer ans900=new FalseAnswer("225",51);
		db.createFalseAnswer(ans900);
		FalseAnswer ans901=new FalseAnswer("220",51);
		db.createFalseAnswer(ans901);
		
		FalseAnswer ans903=new FalseAnswer("Urea",52);
		db.createFalseAnswer(ans903);
		FalseAnswer ans904=new FalseAnswer("Ammonia",52);
		db.createFalseAnswer(ans904);
		
		FalseAnswer ans906=new FalseAnswer("Leg",53);
		db.createFalseAnswer(ans906);
		FalseAnswer ans907=new FalseAnswer("Hand",53);
		db.createFalseAnswer(ans907);
		
		FalseAnswer ans909=new FalseAnswer("Vitamin B",54);
		db.createFalseAnswer(ans909);
		FalseAnswer ans1000=new FalseAnswer("Vitamin E",54);
		db.createFalseAnswer(ans1000);
		
		FalseAnswer ans1002=new FalseAnswer("Clotting",55);
		db.createFalseAnswer(ans1002);
		FalseAnswer ans1003=new FalseAnswer("Anaemia",55);
		db.createFalseAnswer(ans1003);
		

		//level2_category9_false_answers
		
		FalseAnswer ans41_1=new FalseAnswer("Australia",56);
		db.createFalseAnswer(ans41_1);
		FalseAnswer ans41_2=new FalseAnswer("American",56);
		db.createFalseAnswer(ans41_2);
		
		FalseAnswer ans42_1=new FalseAnswer("leg",57);
		db.createFalseAnswer(ans42_1);
		FalseAnswer ans42_2=new FalseAnswer("backbone",57);
		db.createFalseAnswer(ans42_2);
		
		FalseAnswer ans43_1=new FalseAnswer("Symptom",58);
		db.createFalseAnswer(ans43_1);
		FalseAnswer ans43_2=new FalseAnswer("System",58);
		db.createFalseAnswer(ans43_2);
		
		FalseAnswer ans44_1=new FalseAnswer("Parathyroid",59);
		db.createFalseAnswer(ans44_1);
		FalseAnswer ans44_2=new FalseAnswer("Anterior pituitary",59);
		db.createFalseAnswer(ans44_2);
		
		FalseAnswer ans45_1=new FalseAnswer("Kidney",60);
		db.createFalseAnswer(ans45_1);
		FalseAnswer ans45_2=new FalseAnswer("Liver",60);
		db.createFalseAnswer(ans45_2);
		
		//level2_category10_false_answers
		
		FalseAnswer ans46_1=new FalseAnswer("Madonna",61);
		db.createFalseAnswer(ans46_1);
		FalseAnswer ans46_2=new FalseAnswer("Hilary Clinton",61);
		db.createFalseAnswer(ans46_2);
		
		FalseAnswer ans47_1=new FalseAnswer("20 July 1945",62);
		db.createFalseAnswer(ans47_1);
		FalseAnswer ans47_2=new FalseAnswer("19 July 1945",62);
		db.createFalseAnswer(ans47_2);
		
		FalseAnswer ans48_1=new FalseAnswer("Ronaldo",63);
		db.createFalseAnswer(ans48_1);
		FalseAnswer ans48_2=new FalseAnswer("George Weah",63);
		db.createFalseAnswer(ans48_2);
		
		FalseAnswer ans49_1=new FalseAnswer("George Washington",64);
		db.createFalseAnswer(ans49_1);
		FalseAnswer ans49_2=new FalseAnswer("Donald Trump ",64);
		db.createFalseAnswer(ans49_2);
		
		FalseAnswer ans50_1=new FalseAnswer("John Adams",65);
		db.createFalseAnswer(ans50_1);
		FalseAnswer ans50_2=new FalseAnswer("Thomas Jefferson",65);
		db.createFalseAnswer(ans50_2);
		
		//level2_category11_false_answers
		
		FalseAnswer ans51_1=new FalseAnswer("Arrawaddy Bridge",66);
		db.createFalseAnswer(ans51_1);
		FalseAnswer ans51_2=new FalseAnswer("Thanlwin Bridge",66);
		db.createFalseAnswer(ans51_2);
		
		FalseAnswer ans52_1=new FalseAnswer("Sittaung River",67);
		db.createFalseAnswer(ans52_1);
		FalseAnswer ans52_2=new FalseAnswer("Irrawaddy River",67);
		db.createFalseAnswer(ans52_2);
		
		FalseAnswer ans53_1=new FalseAnswer("Amazon",68);
		db.createFalseAnswer(ans53_1);
		FalseAnswer ans53_2=new FalseAnswer("Mekong ",68);
		db.createFalseAnswer(ans53_2);
		
		FalseAnswer ans54_1=new FalseAnswer("Yangon Division",69);
		db.createFalseAnswer(ans54_1);
		FalseAnswer ans54_2=new FalseAnswer("Mon State",69);
		db.createFalseAnswer(ans54_2);
		
		FalseAnswer ans55_1=new FalseAnswer("Tedim",70);
		db.createFalseAnswer(ans55_1);
		FalseAnswer ans55_2=new FalseAnswer("Falam",70);
		db.createFalseAnswer(ans55_2);
		
		//level2_category12_false_answers
		FalseAnswer ans56_1=new FalseAnswer("Thailand",71);
		db.createFalseAnswer(ans56_1);
		FalseAnswer ans56_2=new FalseAnswer("China",71);
		db.createFalseAnswer(ans56_2);
		
		FalseAnswer ans57_1=new FalseAnswer("1985",72);
		db.createFalseAnswer(ans57_1);
		FalseAnswer ans57_2=new FalseAnswer("1990",72);
		db.createFalseAnswer(ans57_2);
		
		FalseAnswer ans58_1=new FalseAnswer("Vietnam",73);
		db.createFalseAnswer(ans58_1);
		FalseAnswer ans58_2=new FalseAnswer("Japan",73);
		db.createFalseAnswer(ans58_2);
		
		FalseAnswer ans59_1=new FalseAnswer("Toyota Setsuna ",74);
		db.createFalseAnswer(ans59_1);
		FalseAnswer ans59_2=new FalseAnswer("Toyota UUV",74);
		db.createFalseAnswer(ans59_2);
		
		FalseAnswer ans60_1=new FalseAnswer("Japan",75);
		db.createFalseAnswer(ans60_1);
		FalseAnswer ans60_2=new FalseAnswer("Thailand",75);
		db.createFalseAnswer(ans60_2);
		
		//level3_category13_false_answers
		FalseAnswer ans61_1=new FalseAnswer("input/output",76);
		db.createFalseAnswer(ans61_1);
		FalseAnswer ans61_2=new FalseAnswer("CPU",76);
		db.createFalseAnswer(ans61_2);
		
		FalseAnswer ans62_1=new FalseAnswer("Steve Jobs",77);
		db.createFalseAnswer(ans62_1);
		FalseAnswer ans62_2=new FalseAnswer("James",77);
		db.createFalseAnswer(ans62_2);
		
		FalseAnswer ans63_1=new FalseAnswer("Mouse",78);
		db.createFalseAnswer(ans63_1);
		FalseAnswer ans63_2=new FalseAnswer("Keyboard",78);
		db.createFalseAnswer(ans63_2);
		
		FalseAnswer ans64_1=new FalseAnswer("Keyboard",79);
		db.createFalseAnswer(ans64_1);
		FalseAnswer ans64_2=new FalseAnswer("Memory Stick",79);
		db.createFalseAnswer(ans64_2);

		FalseAnswer ans65_1=new FalseAnswer("ROM",80);
		db.createFalseAnswer(ans65_1);
		FalseAnswer ans65_2=new FalseAnswer("CPU",80);
		db.createFalseAnswer(ans65_2);
		
		//level3_category14_false_answers
		
		FalseAnswer ans66_1=new FalseAnswer("Germany",81);
		db.createFalseAnswer(ans66_1);
		FalseAnswer ans66_2=new FalseAnswer("France",81);
		db.createFalseAnswer(ans66_2);
		
		FalseAnswer ans67_1=new FalseAnswer("5 years and 1 day",82);
		db.createFalseAnswer(ans67_1);
		FalseAnswer ans67_2=new FalseAnswer("4 years and 1 day",82);
		db.createFalseAnswer(ans67_2);
		
		FalseAnswer ans68_1=new FalseAnswer("Chin",83);
		db.createFalseAnswer(ans68_1);
		FalseAnswer ans68_2=new FalseAnswer("Kayin",83);
		db.createFalseAnswer(ans68_2);
		
		FalseAnswer ans69_1=new FalseAnswer("425ft",84);
		db.createFalseAnswer(ans69_1);
		FalseAnswer ans69_2=new FalseAnswer("225ft",84);
		db.createFalseAnswer(ans69_2);
		
		FalseAnswer ans70_1=new FalseAnswer("Arrawaddy Bridge",85);
		db.createFalseAnswer(ans70_1);
		FalseAnswer ans70_2=new FalseAnswer("Sittaung Bridge",85);
		db.createFalseAnswer(ans70_2);
		
		
		FalseAnswer ans71_1=new FalseAnswer("The formation of rocks",86);
		db.createFalseAnswer(ans71_1);
		FalseAnswer ans71_2=new FalseAnswer("Behavior of human beings",86);
		db.createFalseAnswer(ans71_2);
		
		FalseAnswer ans72_1=new FalseAnswer("core",87);
		db.createFalseAnswer(ans72_1);
		FalseAnswer ans72_2=new FalseAnswer("sunspots",87);
		db.createFalseAnswer(ans72_2);
		
		FalseAnswer ans73_1=new FalseAnswer("autogamy",88);
		db.createFalseAnswer(ans73_1);
		FalseAnswer ans73_2=new FalseAnswer("entomophily",88);
		db.createFalseAnswer(ans73_2);
		
		FalseAnswer ans74_1=new FalseAnswer("heat transfer",89);
		db.createFalseAnswer(ans74_1);
		FalseAnswer ans74_2=new FalseAnswer("morphology",89);
		db.createFalseAnswer(ans74_2);
		
		FalseAnswer ans75_1=new FalseAnswer("mega",90);
		db.createFalseAnswer(ans75_1);
		FalseAnswer ans75_2=new FalseAnswer("meta",90);
		db.createFalseAnswer(ans75_2);
		
		FalseAnswer ans76_1=new FalseAnswer("Jomes",91);
		db.createFalseAnswer(ans76_1);
		
		FalseAnswer ans77_1=new FalseAnswer("1915",92);
		db.createFalseAnswer(ans77_1);
		
		FalseAnswer ans78_1=new FalseAnswer("Liver",93);
		db.createFalseAnswer(ans78_1);
		
		FalseAnswer ans79_1=new FalseAnswer("Japan",94);
		db.createFalseAnswer(ans79_1);
		
		FalseAnswer ans80_1=new FalseAnswer("Ho Chi Minh",95);
		db.createFalseAnswer(ans80_1);
		
		FalseAnswer ans81_1=new FalseAnswer("Memory disk",96);
		db.createFalseAnswer(ans81_1);
		
		FalseAnswer ans82_1=new FalseAnswer("Silver",97);
		db.createFalseAnswer(ans82_1);
		
		FalseAnswer ans83_1=new FalseAnswer("Mira",98);
		db.createFalseAnswer(ans83_1);
		
		FalseAnswer ans84_1=new FalseAnswer("Tutorial",99);
		db.createFalseAnswer(ans84_1);
		
		FalseAnswer ans85_1=new FalseAnswer("Marce John",100);
		db.createFalseAnswer(ans85_1);
		
		FalseAnswer ans86_1=new FalseAnswer("743 BC",101);
		db.createFalseAnswer(ans86_1);
		
		FalseAnswer ans87_1=new FalseAnswer("Franco war",102);
		db.createFalseAnswer(ans87_1);
		
		FalseAnswer ans88_1=new FalseAnswer("James Willion",103);
		db.createFalseAnswer(ans88_1);
		
		FalseAnswer ans89_1=new FalseAnswer("Cremean war",104);
		db.createFalseAnswer(ans89_1);
		
		FalseAnswer ans90_1=new FalseAnswer("900 BC",105);
		db.createFalseAnswer(ans90_1);
	}
	

}










