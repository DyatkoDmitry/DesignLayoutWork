package com.example.designlayoutwork.readyScreenModel

class ProfilesRepository {

    val profiles: MutableList<Profile> = mutableListOf()

    init {
        profiles.addAll(
            arrayOf(Profile(
                    "Izabella Zhang",
                    "Model winner of 2011 Tokyo art costume design week",
                    "girl_1",
                6,
                    2.615f,
             368,
               991,
             56,
      18
                    ),
                    Profile(
                    "Azumi Kawabata",
                     "Model of Tokyo desighners week 2012",
                     "girl_2",
                4,
                    1.569f,
             258,
               512,
             47,
      13
                    ),
                    Profile(
                    "Maruyama Yano",
                     "Model winner of Rakuten Fashion Week TOKYO 2013",
                     "girl_3",
                21,
                     4.116f,
              471,
                35,
              71,
       19
                    ),
                    Profile(
                    "Matida Sekiko",
                     "Miss of New Designer Fashion Grand Prix 2019",
                     "girl_4",
                3,
                    7.022f,
             346,
               45,
             88,
      35
                    ),
                    Profile(
                    "Kaoru Hatanaka",
                     "Top model of Tokyo Fashion Week Fall 2015",
                     "girl_5",
                1,
                    1.052f,
             241,
               54,
             81,
      44
                    ),
                    Profile(
                    "Yumi Fukunaga",
                     "Model of Tokyo Fashion Week Spring 2016",
                     "girl_6",
                15,
                    2.299f,
             197,
               31,
             71,
      26
                    ),
                     Profile(
                    "Hotaru Nishimoto",
                    "Model of Japan Media Arts Festival 2018",
                    "girl_7",
                    4,
                    5.983f,
                    53,
                    14,
                    31,
                    11
                ),
                Profile(
                    "Kanako Ohashi",
                    "Model of Tokyo Design Week 2016",
                    "girl_8",
                    15,
                    1.256f,
                    29,
                    7,
                    23,
                    5
                ),
                Profile(
                    "Masako Shibata",
                    "The winner of Tokyo Girls Award 2011",
                    "girl_9",
                    1,
                    4.76f,
                    8,
                    7,
                    17,
                    3
                ),
                Profile(
                    "Takara Minamoto",
                    "The winner of the Grand Final of Tokyo Collection 2017",
                    "girl_10",
                    24,
                    5.16f,
                    27,
                    21,
                    38,
                    10
                ),
           )
      )
   }
}