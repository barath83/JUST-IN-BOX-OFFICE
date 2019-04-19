package com.example.barath.jb;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.firebase.client.Firebase;


public class ninetysix extends AppCompatActivity {
    ImageView mimageview;
    TextView mtextview;
    TextView ltextview;
    TextView ntextview;
    TextView rtextview;
    TextView stextview;
    TextView ctextview;
    Button wishlist;

    Firebase mwish;



    ListView clistview;

    String [] lovecast = new String[] {"Vijay Sethupathi","Trisha Krishnan","Prem Kumar","Govind Vasantha","Varsha Bollama","Adhitya Bhaskar","Gouri G Kishan"};
    int[] lovecastimages = {R.drawable.vjslove,
                          R.drawable.trishalove,
                          R.drawable.premlove,R.drawable.govindlove,R.drawable.varshalove,R.drawable.adhilove,R.drawable.gourilove};
    
    String [] lovebio = new String[] {"Vijay Sethupathi was born in Rajapalayam in Virudhunagar district and moved to Chennai when he was in Class six. He did his schooling in MGR Higher Secondary School in Kodambakkam. According to Sethupathy, he was neither interested in sports nor extra-curricular activities. He graduated with a B.Com degree from DB Jain College in Thoraipakam, following which he worked for three years as an accountant in Dubai, U.A.E. Unhappy with his job, he returned to India in 2003. ",
                                    "Trisha Krishnan was born on the 4th of May 1983 in Pallakad, Kerala, India. She speaks English, Hindi, Tamil and French. She studied at Church Park, India and Ethiraj College, India. She was introduced into the film industry through director Ameer Sultan's film, Mounam Pesiyadhey where she acted in opposite Surya. After that, she acted in Priyadarshan's Tamil project entitled Laysa Laysa. She was crowned Miss Chennai in the year 2000 and won Miss Salem in the year 1999 and won Miss India Beautiful Smile in 2001. ",
              "Prem Kumar R turned out to be director with the heart-warming tale of romance that rekindles your school time love stories.He previously worked as Cinematographer in films like Rummy,Naduvula Konja Pkatha Kaanum also Pasanga" ,
    "Govind Vasantha  is an Indian composer, singer, and violinist who works in Malayalam and Tamil films. He is one of the founding members of the musical band Thaikkudam Bridge, in which he is a vocalist and violinist.Govind was born on 29 October 1988 to Peethambaran Menon & Vasanthakumari. He hails from a musical family in Irinjalakuda.Govind is married to his longtime girlfriend Renjini Achuthan Menon since 4 December 2012."};


    String [] loveidentity = new String[] {"Actor,Producer","Actress","Director","Music Composer"};
    String [] identity = new String[] {"Actor","Actress","Director","Music Composer"};

    String [] ratsasancast = new String[] {"Vishnu Vishal","Amala Paul","Ram Kumar","Ghibran","Munishkanth","Nizhagal Ravi"};
    int [] ratsasanimages = {R.drawable.vishnuratsasan,
                              R.drawable.amalaratsasan,
                              R.drawable.ramratsasan,R.drawable.ghibranratsasan,R.drawable.munisratsasan,R.drawable.raviratsasan};
    String [] ratsasanbio = new String[] {"Vishnu Vishal is an Indian film actor and producer who has appeared in Tamil language films. He started his acting career in the year 2009 playing the lead role in the sports film Vennila Kabadi Kuzhu, winning acclaim for his portrayal. Vishnu won further acclaim for his role in Neerparavai (2012), portraying a fisherman.Vishnu was born as Vishal to Ramesh Kudawla, a high-ranking Tamil Nadu police officer.He finished his schooling in Campion Anglo-Indian Higher Secondary School in Tiruchirappalli.",
            "Amala Paul (born 26 October 1991) is an Indian film actress who works in the South Indian Film Industry. After appearing in supporting roles in the Malayalam film Neelathamara. She received critical acclaim for the portrayal of a controversial character in the film Sindhu Samaveli. Despite the failure of that film, Amala became noted after playing the title role in Mynaa, receiving critical acclaim for her work ",
            "Ram Kumar is a director and writer, known for Mundaasupatti (2014), Ratsasan (2018) and Manasara Vazhthungalen (1991).",
            "Mohamaad Ghibran (often credited as M. Ghibran) is an Indian composer. He has composed music for Indian films, advertising films and television commercial jingles in different languages.Ghibran was born and raised in Coimbatore. When he was in the tenth grade, his family relocated to Chennai after his father suffered a severe loss in business. He had to discontinue studies and do several jobs to support his family."
          };

    String [] vadacast = new String[] {"Dhanush","Ameer Sultan","Aishwarya Rajesh","Andrea Jermiah","Vetri Maaran","Santhosh Narayan","Samuthirakani","Daniel Balaji","Kishore"};
    int[] vadacastimages = {R.drawable.dhanushvada,R.drawable.ameervada,R.drawable.aishwaryavada,R.drawable.andreavada,R.drawable.vetrivada,R.drawable.santhoshvada,R.drawable.samuvada,R.drawable.danielvada,R.drawable.kishorevada};
    String [] vadaidentity = new String[] {"Actor,Producer,Director","Writer,Director,Actor","Actress","Actress,Playback Singer","Director,Producer","Music Composer"};

    String [] vadabio = new String[]{"Venkatesh Prabhu known by his stage name Dhanush, is an Indian film actor, producer, lyricist and playback singer who has worked predominantly in Tamil cinema. In 2011, he won the National Film Award for Best Actor for the Tamil film \"Aadukalam\" and in the same year, he received international attention for his song \"Why This Kolaveri Di\", which went on to became the most viewed Indian song in YouTube.His first film was \"Thulluvadho Ilamai\", a 2002 coming-of-age movie directed by his father,Kasthuri Raja.",
       "Ameer Sultan (born 5 December 1967) is an Indian film director, producer and actor, working in the Tamil film industry. Ameer Sultan was born in Madurai, Tamil Nadu India. He initially studied economics and worked as an entrepreneur before starting to work as an assistant director to Tamil filmmaker Bala on his award-winning film Sethu in 1999 Shortly after, he directed his first film, the romantic comedy Mounam Pesiyadhe (2002).",
         "Aishwarya Rajesh is an Indian film actress, who has appeared in leading roles primarily in Tamil cinema. She started her career as Anchor in a famous comedy show called Asathapovadhu Yaru on Sun TV. After winning the reality show Maanada Mayilada. she made her debut in Avargalum Ivargalum (2011) and became known after starring in Attakathi (2012) portraying the role of Amudha.Aishwarya was born in Chennai. She did her schooling in Holy Angels Anglo Indian Higher Secondary School in T.Nagar.",
   "Andrea Jeremiah (born 21 December 1984) is an Indian actress, playback singer, musician and dancer. She works predominantly in the Tamil and Malayalam film industries. She began her career as a playback singer, and has subsequently appeared in films.",
    "Vetri Maaran is an Indian film director, screenwriter, and film producer, who works in the Tamil film industry. As of 2016, he has won four National Film Awards and one Filmfare Award. Vetri Maaran made his directorial debut with the critically acclaimed Polladhavan (2007). His second feature film Aadukalam (2011) won six National Film Awards. He produces films under his production company, Grass Root Film Company. His movie Visaaranai (2016) has been selected as India's official entry to Academy Awards",
    "Santhosh Narayanan is an Indian film composer and musician in the Tamil film industry. He made his debut as a film composer in the 2012 Tamil film Attakathi.Santhosh Narayanan was born in Srirangam (Trichy), India. He is the youngest of two children. He was educated at RSK Higher Secondary School, Tiruchirappalli. Santhosh Narayanan completed his B.E., Computer Science & Engineering at J. J. College of Engineering and Technology"};


    String[] twopointcast = new String[] {"RajniKanth","Akshay Kumar","Amy Jackson","Shankar","AR Rahman","Sudanshu Pandey"};
    int [] twopointcastimages = {R.drawable.rajnitwo,R.drawable.akshaytwo,R.drawable.amytwo,
                                  R.drawable.shankartwo,R.drawable.rahmantwo,R.drawable.sudanshutwopoint};
    String [] twopointidentity = new String [] {"Actor,Writer,Producer","Actor,Producer","Actress","Director","Music Composer"};
    String [] twopointbio = new String[]{"Rajinikanth has been a megastar in the Tamil movie industry since the 70s. He is one of the highest earning actors in Asia. Primarily starring in Tamil movies, he has also worked in Hindi, Telugu, Kannada, and American movies. He was born in Bangalore (India), and was employed as a bus conductor before he joined the Madras Film Institute. He made his debut in _Katha Sangama (1975)_ and became a star with _Apoorva Raagangal (1975)_ . His unique acting style is characterized by trademark gestures such as flipping a cigarette in the air and catching it with his mouth. He played varied roles successfully and is considered as an actor who can easily perform action, drama, and comedy.",
    "Rajiv Hari Om Bhatia (born 9 September 1967), known professionally as Akshay Kumar, is an Indian actor, producer, television personality, martial artist, stuntman and philanthropist who works in Bollywood films. In a career spanning over twenty five years, Kumar has appeared in over a hundred films and has won several awards, including the National Film Award for Best Actor for his performance in Rustom (2017), and two Filmfare Awards for Ajnabee (2001) and Garam Masala (2005).Akshay Kumar is one of the most prolific actors of Indian cinema, having starred in 108 films",
    "Amy Jackson is a British actress who began her acting career in India.Amy became a household name after movies such as 'I', 'Singh is Bling' and 'Theri'. Jackson's career prospects continue to grow with her first Hollywood role as Saturn Girl in season 3 of The CW's superhero series Supergirl (2017)",
    "Shankar is an Indian film director and producer who works mainly in Tamil cinema. He started his career as an assistant director to SA Chandrasekar and now he is the highest paid director in the country. He made his debut in Gentleman (1993) and since 2015 he has directed 12 movies. He won the CNN-IBN Indian of the Year 2010, in the Entertainment category.",
    "A two-time winner and five-times nominee of the Academy Award (Oscar), A. R. Rahman is popularly known as the man who has redefined contemporary Indian music. Rahman, according to a BBC estimate, has sold more than 150 million copies of his work comprising of music from more than 100 film soundtracks and albums across over half a dozen languages, including landmark scores such as 'Roja', 'Bombay', Dil Se', 'Taal', 'Lagaan', 'Vandemataram', 'Jodhaa Akbar', 'Slumdog Millionaire', '127 Hours' and countless more.Rahman pursued music as a career at a very young age and after assisting leading musicians in India went on to compose jingles and scores for popular Indian television features."};


    String [] aquamancast = new String[] {"Jason Momoa","Amber Heard","Wiliam Dafoe","James Wan","Nicole Kidman","Patrick Wilson"};
    int [] aquamancastimages = {R.drawable.jasonaqua,R.drawable.amberaqua,R.drawable.williamaqua,R.drawable.jamesaqua,R.drawable.nicoleaqua,R.drawable.patricaqua};
    String [] aquaidentity = new String[] {"Actor,Producer,Director","Actress,Producer","Actor,Producer","Director,Producer,Writer"};
    String [] aquabio = new String[]{"Joseph Jason Namakaeha Momoa was born on August 1, 1979, in Honolulu, Hawaii. He is the son of Coni (Lemke), a photographer, and Joseph Momoa, a painter. His father is of Hawaiian descent and his mother, who is from Iowa, is of mostly German ancestry. Jason was raised in Norwalk, Iowa, by his mother. After high school, he moved to Hawaii, where he landed a lead role, beating out of thousands of hopefuls in the TV series Baywatch (1989) (known as \"Baywatch Hawaii\" in its 10th season).Jason lives with his wife, actress Lisa Bonet, with whom he has two children, Lola and Nakoa-Wolf.",
    " Amber Laura Heard was born in Austin, Texas, to Patricia Paige Heard (née Parsons), an internet researcher, and David C. Heard (David Clinton Heard), a contractor. She has English, Irish, Scottish, German, and Welsh ancestry. Heard starred on The CW drama, Hidden Palms (2007), and had guest starring roles on Showtime's Californication (2007) and CBS's Criminal Minds (2005).",
    "Willem Dafoe is internationally respected for bringing versatility, boldness, and dare to some of the most iconic films of our time. His artistic curiosity in exploring the human condition leads him to projects all over the world, large and small, Hollywood films as well as Independent cinema.Willem was born in Appleton, Wisconsin, to Muriel Isabel (Sprissler), a nurse, and William Alfred Dafoe, a surgeon. He is of mostly German, Irish, Scottish, and English descent. He and his wife, director Giada Colagrande, have made three films together: Padre, A Woman, and Before It Had A Name.",
    "James Wan (born 26 February 1977) is an Australian film producer, screenwriter and film director of Malaysian Chinese descent. He is widely known for directing the horror film Saw (2004) and creating Billy the puppet. Wan has also directed Dead Silence (2007), Death Sentence (2007), Insidious (2010), The Conjuring (2013) and Furious 7 (2015).Before his success in the mainstream film industry, he made his first feature-length film, Stygian, with Shannon Young, which won \"Best Guerrilla Film\" at the Melbourne Underground Film Festival (MUFF) in 2000."};


    String [] kedarnathcast = new String[] {"Sushanth Singh Rajput","Sara Ali Khan","Abhishek Kapoor","Amit Trivedi"};
    int [] kedarnathcastimages = {R.drawable.sushanthkedar,R.drawable.sarakedar,R.drawable.abhishekkedar,R.drawable.amitkedar};
    String[] kedarbio = new String[] {"Sushant Singh Rajput is an Indian television and film actor. He is best known for playing the role of Manav in the ongoing TV series, Pavitra Rishta on Zee Tv. Having made his Bollywood debut with a blockbuster of a movie, Kai Po Che directed by Abhishek Kapoor which was adapted by Chetan Bhagat's novel, The 3 Mistake of My Life, he has launched himself to soaring new heights in the film industry.Sushant Singh Rajput (born January 21, 1986) is an Indian film actor, dancer, television personality,an entrepreneur and a philanthropist.",
    "Sara Ali Khan was born on 12 August 1995 in Mumbai, India, to Saif Ali Khan, son of Mansoor Ali Khan Pataudi and Sharmila Tagore, and Amrita Singh; both are actors of the Hindi film industry.She is a part of the Pataudi family.Khan made her acting debut in the romantic drama Kedarnath (2018), which co-starred Sushant Singh Rajput.",
    "Abhishek Kapoor (born 6 August 1971) is an Indian film actor, director and producer.n 2008, he wrote and directed Rock On!! an Indian Rock musical film starring Farhan Akhtar and Arjun Rampal that did average but is hailed as a veritable cult classic and won the prestigious \"National Award for Best Hindi Film\" for outstanding artistic contribution towards cinema. The film went on to become a major success, bringing not just accolades but also a Filmfare Award in 2009.He started his career as an actor in Uff! Yeh Mohabbat in 1996, opposite Twinkle Khanna, directed by Vipin Handa.",
    "Amit Trivedi is an Indian film score composer, music director, singer and lyricist. After working as a theatre and jingle composer and composing for non-film albums, he debuted as a film composer in the 2008 Hindi film Aamir,and was noticed for his critically acclaimed work in the Hindi film Dev.D (2009),which earned him several Awards, including the 2010 National Film Awards for Best Music Direction."};

    String [] taxicast = new String []{"Vijay Devarkonda","Priyanka Jawalkar","Rahul Sankrityan","Malavika Nair","Madhunadhan"};
    int [] taxicastimages = {R.drawable.vijaytaxi,R.drawable.priyankataxi,R.drawable.rahultaxi,R.drawable.malavikataxi,R.drawable.madhutaxi};
    String [] taxiidentity = new String[] {"Actor","Actress","Director"};
    String [] taxibio = new String []{"Vijay Deverakonda is an Indian film actor known for his works in Telugu cinema.Vijay made his film debut in 2011 with Ravi Babu's romantic comedy Nuvvila (2011), but he gained recognition with his supporting role in the coming-of-age drama Yevade Subramanyam (2015).Vijay gained stardom by playing the lead role in the 2016 blockbuster romantic comedy Pelli Choopulu, which won the National Film Award for Best Feature Film in Telugu and the Filmfare Award for Best Film - Telugu. Vijay has since starred in lead roles in critical and commercial successes such as Arjun Reddy (2017), Mahanati (2018), Geetha Govindam (2018), and Taxiwaala (2018), some of which rank among the list of highest-grossing Telugu films.",
    "Priyanka Jawalkar is an actress, known for Kala Varam Aaye (2017) and Taxiwaala (2018).",
    "Rahul Sankrityan is a Telugu film director and writer. He made his Tollywood directorial debut with thriller ‘The End’. Before doing this film he worked as IT Engineer at Infosys and resigned to fulfill his passion of making films. He has directed Vijay Devarakonda’s next Taxiwala with Priyanka Jawalkar also in lead role.Before entering Tollywood, he had done a few short films and won the MAA TV short film contest."};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ninetysix);

        mimageview = (ImageView) findViewById(R.id.imageView2);
        mtextview = (TextView) findViewById(R.id.textView2);
        ltextview = (TextView) findViewById(R.id.textView4);
        ntextview = (TextView) findViewById(R.id.textView5);
        rtextview = (TextView) findViewById(R.id.textView6);
        stextview = (TextView) findViewById(R.id.textView9);
        wishlist = (Button) findViewById(R.id.wishbutton);

        
        Bundle mbundle = getIntent().getExtras();
        if(mbundle!=null){
            mtextview.setText(mbundle.getString("MovieName"));
            mimageview.setImageResource(mbundle.getInt("MoviePoster"));
            ltextview.setText(mbundle.getString("Movieyear"));
            ntextview.setText(mbundle.getString("Movietime"));
            rtextview.setText(mbundle.getString("Moviecategory"));
            stextview.setText(mbundle.getString("Movieabout"));


        }

        clistview = (ListView)findViewById(R.id.listview1);
       CCAdapter  myccadapter = new CCAdapter(ninetysix.this,lovecast,lovecastimages);
           if(mtextview.getText().toString().equalsIgnoreCase("96")){
        clistview.setAdapter(myccadapter);
        clistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent cintent = new Intent(ninetysix.this,castcrew.class);
                cintent.putExtra("CastName",lovecast[position]);
                cintent.putExtra("CastImage",lovecastimages[position]);
                cintent.putExtra("Castidentity",loveidentity[position]);
                cintent.putExtra("Castbio",lovebio[position]);
             startActivity(cintent);
            }
        });}

       CCAdapter rccadapter = new CCAdapter(ninetysix.this,ratsasancast,ratsasanimages);
        if(mtextview.getText().toString().equalsIgnoreCase("Ratchasan")){
            clistview.setAdapter(rccadapter);
            clistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent cintent = new Intent(ninetysix.this,castcrew.class);
                    cintent.putExtra("CastName",ratsasancast[position]);
                    cintent.putExtra("CastImage",ratsasanimages[position]);
                    cintent.putExtra("Castidentity",identity[position]);
                    cintent.putExtra("Castbio",ratsasanbio[position]);
                    startActivity(cintent);
                }
            });}

        CCAdapter vccadapter = new CCAdapter(ninetysix.this,vadacast,vadacastimages);
        if(mtextview.getText().toString().equalsIgnoreCase("VadaChennai")){
            clistview.setAdapter(vccadapter);
            clistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent cintent = new Intent(ninetysix.this,castcrew.class);
                    cintent.putExtra("CastName",vadacast[position]);
                    cintent.putExtra("CastImage",vadacastimages[position]);
                    cintent.putExtra("Castidentity",vadaidentity[position]);
                    cintent.putExtra("Castbio",vadabio[position]);
                    startActivity(cintent);
                }
            });}

        CCAdapter tccadapter = new CCAdapter(ninetysix.this,twopointcast,twopointcastimages);
        if(mtextview.getText().toString().equalsIgnoreCase("2.0")){
            clistview.setAdapter(tccadapter);
            clistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent cintent = new Intent(ninetysix.this,castcrew.class);
                    cintent.putExtra("CastName",twopointcast[position]);
                    cintent.putExtra("CastImage",twopointcastimages[position]);
                    cintent.putExtra("Castidentity",twopointidentity[position]);
                    cintent.putExtra("Castbio",twopointbio[position]);
                    startActivity(cintent);
                }
            });}

        CCAdapter accadapter = new CCAdapter(ninetysix.this,aquamancast,aquamancastimages);
        if(mtextview.getText().toString().equalsIgnoreCase("Aquaman")){
            clistview.setAdapter(accadapter);
            clistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent cintent = new Intent(ninetysix.this,castcrew.class);
                    cintent.putExtra("CastName",aquamancast[position]);
                    cintent.putExtra("CastImage",aquamancastimages[position]);
                    cintent.putExtra("Castidentity",aquaidentity[position]);
                    cintent.putExtra("Castbio",aquabio[position]);
                    startActivity(cintent);
                }
            });}

        CCAdapter kccadapter = new CCAdapter(ninetysix.this,kedarnathcast,kedarnathcastimages);
        if(mtextview.getText().toString().equalsIgnoreCase("Kedarnath")){
            clistview.setAdapter(kccadapter);
            clistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent cintent = new Intent(ninetysix.this,castcrew.class);
                    cintent.putExtra("CastName",kedarnathcast[position]);
                    cintent.putExtra("CastImage",kedarnathcastimages[position]);
                    cintent.putExtra("Castidentity",identity[position]);
                    cintent.putExtra("Castbio",kedarbio[position]);
                    startActivity(cintent);
                }
            });}

         CCAdapter taxiccadapter = new CCAdapter(ninetysix.this,taxicast,taxicastimages);
        if(mtextview.getText().toString().equalsIgnoreCase("Taxiwaala")){
            clistview.setAdapter(taxiccadapter);
            clistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent cintent = new Intent(ninetysix.this,castcrew.class);
                    cintent.putExtra("CastName",taxicast[position]);
                    cintent.putExtra("CastImage",taxicastimages[position]);
                    cintent.putExtra("Castidentity",taxiidentity[position]);
                    cintent.putExtra("Castbio",taxibio[position]);
                      startActivity(cintent);
                }
            });}


        if(mtextview.getText().toString().equalsIgnoreCase("96")) {
            String DeviceID = Settings.Secure.getString(getApplicationContext().getContentResolver(),Settings.Secure.ANDROID_ID);
            mwish = new Firebase("https://jbfirst-d45b8.firebaseio.com/" + DeviceID + "/Wishlist/");
            wishlist.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Firebase mRefChild = mwish.child(mtextview.getText().toString());
                    mRefChild.setValue("Yes");

                }
            });
        }


        if(mtextview.getText().toString().equalsIgnoreCase("Ratchasan")) {
            String DeviceID = Settings.Secure.getString(getApplicationContext().getContentResolver(),Settings.Secure.ANDROID_ID);
            mwish = new Firebase("https://jbfirst-d45b8.firebaseio.com/" + DeviceID + "/Wishlist/");
            wishlist.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Firebase mRefChild = mwish.child(mtextview.getText().toString());
                    mRefChild.setValue("Yes");

                }
            });
        }


        if(mtextview.getText().toString().equalsIgnoreCase("VadaChennai")) {
            String DeviceID = Settings.Secure.getString(getApplicationContext().getContentResolver(),Settings.Secure.ANDROID_ID);
            mwish = new Firebase("https://jbfirst-d45b8.firebaseio.com/" + DeviceID + "/Wishlist/");
            wishlist.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Firebase mRefChild = mwish.child(mtextview.getText().toString());
                    mRefChild.setValue("Yes");

                }
            });
        }


        if(mtextview.getText().toString().equalsIgnoreCase("2.0")) {
            String DeviceID = Settings.Secure.getString(getApplicationContext().getContentResolver(),Settings.Secure.ANDROID_ID);
            mwish = new Firebase("https://jbfirst-d45b8.firebaseio.com/" + DeviceID + "/Wishlist/");
            wishlist.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Firebase mRefChild = mwish.child("Two Point O");
                    mRefChild.setValue("Yes");

                }
            });
        }


        if(mtextview.getText().toString().equalsIgnoreCase("Aquaman")) {
            String DeviceID = Settings.Secure.getString(getApplicationContext().getContentResolver(),Settings.Secure.ANDROID_ID);
            mwish = new Firebase("https://jbfirst-d45b8.firebaseio.com/" + DeviceID + "/Wishlist/");
            wishlist.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Firebase mRefChild = mwish.child(mtextview.getText().toString());
                    mRefChild.setValue("Yes");

                }
            });
        }


        if(mtextview.getText().toString().equalsIgnoreCase("Kedarnath")) {
            String DeviceID = Settings.Secure.getString(getApplicationContext().getContentResolver(),Settings.Secure.ANDROID_ID);
            mwish = new Firebase("https://jbfirst-d45b8.firebaseio.com/" + DeviceID + "/Wishlist/");
            wishlist.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Firebase mRefChild = mwish.child(mtextview.getText().toString());
                    mRefChild.setValue("Yes");

                }
            });
        }


        if(mtextview.getText().toString().equalsIgnoreCase("Taxiwaala")) {
            String DeviceID = Settings.Secure.getString(getApplicationContext().getContentResolver(),Settings.Secure.ANDROID_ID);
            mwish = new Firebase("https://jbfirst-d45b8.firebaseio.com/" + DeviceID + "/Wishlist/");
            wishlist.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Firebase mRefChild = mwish.child(mtextview.getText().toString());
                    mRefChild.setValue("Yes");

                }
            });
        }



    }

}
