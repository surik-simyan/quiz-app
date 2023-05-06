package org.company.quiz.data

abstract class Question {
    abstract val question: String
    abstract fun validateAnswer(answer: String): Boolean

    // 10
    companion object {
        val questions = listOf(
            MultipleChoiceQuestion(
                question = "Առաջին անգամ ե՞րբ է տպագրվել «Ծաղկած փշալարեր» վիպակը",
                options = listOf(
                    MultipleChoiceQuestion.Option("1971-72թթ", true),
                    MultipleChoiceQuestion.Option("1985", false),
                    MultipleChoiceQuestion.Option("1974-75", false),
                    MultipleChoiceQuestion.Option("1980", false),
                ),
            ),
            MultipleChoiceQuestion(
                question = "Գուրգեն Մահարու «Ծաղկած փշալարեր» վիպակն առաջին անգամ որտե՞ղ է տպագրվել",
                options = listOf(
                    MultipleChoiceQuestion.Option("Երևանում", false),
                    MultipleChoiceQuestion.Option("Մոսկվայում", false),
                    MultipleChoiceQuestion.Option("Բեյրութում", true),
                    MultipleChoiceQuestion.Option("Փարիզում", false),
                ),
            ),
            MultipleChoiceQuestion(
                question = "Ո՞ր շաբաթաթերթում է տպագրվել «Ծաղկած փշալարեր» վիպակը",
                options = listOf(
                    MultipleChoiceQuestion.Option("«Վահան»", false),
                    MultipleChoiceQuestion.Option("«Ակօս»", false),
                    MultipleChoiceQuestion.Option("«Գրական թերթ»", false),
                    MultipleChoiceQuestion.Option("«Նաիրի»", true),
                ),
            ),
            YesNoQuestion(
                question = "Մինչև 1988թ Երևանում վախենում էին հրատարակել վիպակը, ինչը պայմանավորված էր Մոսկվայի բացասական արձագանքով",
                isAnswerYes = true,
            ),
            YesNoQuestion(
                question = "«Ծաղկած փշալարեր» վիպակը կոչված էր շարունակելու հեղինակի կենսապատումը սկսած 1936 թվականից և հասցներ մինչև 1947 թվականը՝ ընդգրկելով գրողի առաջին աքսորի տարիները",
                isAnswerYes = true,
            ),
            YesNoQuestion(
                question = "Ծաղկած փշալարեր վիպակում ներկայացվում է աքսորականների զինված պայքարը խորհրդային միության դեմ",
                isAnswerYes = false,
            ),
            MultipleChoiceQuestion(
                question = "Ովքե՞ր են «Ծաղկած փշալարեր» վիպակի հերոսները",
                options = listOf(
                    MultipleChoiceQuestion.Option("Լյուդմիլա Շարթ, Աշոտ Դայի", true),
                    MultipleChoiceQuestion.Option("Դիլան Դայի, Օհամ Ամի", false),
                    MultipleChoiceQuestion.Option("Օհանես աղա, Բիչկո", false),
                    MultipleChoiceQuestion.Option("Եպրաքսե հանըմ, Պիեր", false),
                ),
            ),
            MultipleChoiceQuestion(
                question = "Ի՞նչ անհիմն մեղադրանքով էին ձերբակալել Գուրգեն Մահարիին",
                options = listOf(
                    MultipleChoiceQuestion.Option(
                        "Նա մեղադրվում էր լրտեսության մեջ",
                        false,
                    ),
                    MultipleChoiceQuestion.Option(
                        "Մեղադրվում էր ԼՂ-ն Ադրբեջանից անջատելու և Հայաստանին միացնելու մեջ",
                        false,
                    ),
                    MultipleChoiceQuestion.Option(
                        "Մեղադրվում էր նացիոնալիստական կուսակցությունում հակասովետական գործունեություն ծավալելու մեջ",
                        true,
                    ),
                    MultipleChoiceQuestion.Option(
                        "Մեղադրվում էր հակասովետական գաղափարախոսությունների տարածման մեջ",
                        false,
                    ),
                ),
            ),
            SingleAnswerQuestion(
                question = "Որտեղ էր աշխատում Մահարին աքսորի տարիներին",
                possibleCorrectAnswers = listOf(
                    "Բրուտանոցում",
                    "Բրուտան",
                    "Brutanoc",
                ),
            ),
            MultipleChoiceQuestion(
                question = "Ո՞ր պնդումն է սխալ Գուրգեն Մահարու «Ծաղկած փշալարեր» վիպակի վերաբերյալ",
                options = listOf(
                    MultipleChoiceQuestion.Option(
                        "Վիպակը հեղինակի և այլ աքսորականների կյանքի պատմությունն է",
                        false,
                    ),
                    MultipleChoiceQuestion.Option(
                        "Վիպակում ցույց է տրված, թե ինչպես ամենածանր հալածանքների պայմաններում անգամ մարդը փորձում է պահպանել մարդկային արժեքները",
                        false,
                    ),
                    MultipleChoiceQuestion.Option(
                        "Վիպակում պատկերված են աքսորականների կյանքի ծանր, սոսկալի պայմանները",
                        false,
                    ),
                    MultipleChoiceQuestion.Option(
                        "Ճամբարային դաժան իրականությունը փոխել էր մարդկանց և նրանք մոռացել էին թե ինչ է սեր",
                        true,
                    ),
                ),
            ),
            MultipleChoiceQuestion(
                question = "Գուրգեն Մահարու «Ծաղկած փշալարեր» ինքնակենսագրական վիպակում պատկերված են՝ ",
                options = listOf(
                    MultipleChoiceQuestion.Option("գրողի առաջին աքսորի տարիները", true),
                    MultipleChoiceQuestion.Option("գրողի հիշողությունները Արևմտյան Հայաստանից", false),
                    MultipleChoiceQuestion.Option("գրողի ծանր կյանքը հետաքսորյան տարիներին", false),
                    MultipleChoiceQuestion.Option("գրողի գաղթի տարիները և Արևելյան Հայաստանում հաստատվելը", false),
                ),
            ),
            MultipleChoiceQuestion(
                question = "Ի՞նչ դրվագով է սկսվում Գուրգեն Մահարու «Ծաղկած փշալարեր» վիպակը",
                options = listOf(
                    MultipleChoiceQuestion.Option("հեղինակին աքսորելու սրտմաշուկ տեսարանով", false),
                    MultipleChoiceQuestion.Option("Լյուդմիլա Շարթի՝ Իվան Բիչկոյի ուղեկցությամբ բրուտանոց գալով", true),
                    MultipleChoiceQuestion.Option("անծայրածիր տայգայի նկարագրությամբ", false),
                    MultipleChoiceQuestion.Option("աքսորականների` ճամբարային բանահյուսության զրույցներով", false),
                ),
            ),
            YesNoQuestion(
                question = "Լյուդմիլա Շարթին մեղադրում էին լրտեսության մեջ,քանի որ նա այցելել էր Գերմանիա և վերադարձել ԽՍՀՄ",
                isAnswerYes = true,
            ),
            MultipleChoiceQuestion(
                question = "Ինչու Լյուդմիլա Շարթը չհամաձայնվեց քանդակել Ստալինի գլուխը",
                options = listOf(
                    MultipleChoiceQuestion.Option("Շատ դժվար էր իր համար", false),
                    MultipleChoiceQuestion.Option("Բիչկոն ոչինչ չէր խոստացել դրա դիմաց", false),
                    MultipleChoiceQuestion.Option("Նա համաձայնվեց քանդակել Ստալինի գլուխը", false),
                    MultipleChoiceQuestion.Option("Պարզաբանեց որ սխալ կլինի եթե թշնամի աքսորականը պատրաստ", true),
                ),
            ),
            SingleAnswerQuestion(
                question = "Ով պատվիրեց Լենինի արձանը",
                possibleCorrectAnswers = listOf(
                    "Բիչկոն",
                    "Բիչկո",
                    "Bichkon",
                    "Bichko",
                ),
            ),
            MultipleChoiceQuestion(
                question = "Ի՞նչը պատկերված չէ Գուրգեն Մահարու «Ծաղկած փշալարեր» վիպակում",
                options = listOf(
                    MultipleChoiceQuestion.Option(
                        "Սիբիրյան աքսորավայրը և մարդկանց տառապանքը անմարդկային պայմաններում",
                        false,
                    ),
                    MultipleChoiceQuestion.Option("Խորհրդային ժամանակների աքսորականների զինված պայքարի դրվագն", true),
                    MultipleChoiceQuestion.Option(
                        "Աքսորականների մարդկային հարաբերությունները, սիրո դրաման և փախուստի փորձերը",
                        false,
                    ),
                    MultipleChoiceQuestion.Option(
                        "Հալածանքների ու կտտանքների մեջ անգամ մարդկային արժեքների պահպանումն ու արդարության որոնումը",
                        false,
                    ),
                ),
            ),
            MultipleChoiceQuestion(
                question = "Գուրգեն Մահարու «Ծաղկած փշալարեր» վիպակի ո՞ր հերոսն է հիվանդանոցում գաղտնի այցելում Լյուդմիլա Շարթին՝ անտեսելով բռնվելու վտանգը",
                options = listOf(
                    MultipleChoiceQuestion.Option("Աշոտ Դային", false),
                    MultipleChoiceQuestion.Option("Մամոն", false),
                    MultipleChoiceQuestion.Option("հեղինակը", true),
                    MultipleChoiceQuestion.Option("Բիչկոն", false),
                ),
            ),
            MultipleChoiceQuestion(
                question = "Ո՞ր սյուժետային գիծը չկա «Ծաղկած փշալարեր» վիպակում",
                options = listOf(
                    MultipleChoiceQuestion.Option(
                        "Մանրամասն գրում է, թե ինչպես են անհիմն մեղադրանքով իրեն ձերբակալել, իբր թե մասնակցություն է ունեցել խորհրդային իշխանության դեմ գործող նացիոնալիստական կուսակցության մեջ ու ցանկացել է Հայաստանն անջատել Սովետական Միություն",
                        false,
                    ),
                    MultipleChoiceQuestion.Option(
                        "Մահարին «Ծաղկած փշալարեր» վիպակում պատմում է աքսորի տարիների սիբիրյան տպավորությունների մասին, հիշում է ճամբարներում ապրած իր չարքաշ կյանքը",
                        false,
                    ),
                    MultipleChoiceQuestion.Option(
                        "Դեպքերը այս վիպակում հիմնականում ընթանում են աքսորավայրում՝ հանքերում",
                        true,
                    ),
                    MultipleChoiceQuestion.Option(
                        "Վիպակում հատուկ տեղ ունեն հայ կալանավորները, նրանցից մեկն էլ Աշոտ դային էր, նա խելոք ու լուռ մարդ էր. հաճախ էին նրա խորհուրդները հարցնում",
                        false,
                    ),
                ),
            ),
            MultipleChoiceQuestion(
                question = "Ինչու էին աքսորականները մերժում Մամոյի ճաշկերույթի հրավերները",
                options = listOf(
                    MultipleChoiceQuestion.Option("Նրանք կարտոֆիլ չէին սիրում", false),
                    MultipleChoiceQuestion.Option("Կարտոֆիլը բավարարում էր միայն Մամոյին", false),
                    MultipleChoiceQuestion.Option("Կարտոֆիլը անհամ էր", false),
                    MultipleChoiceQuestion.Option("Գիտեին որ Մամոն չի սիրում կիսվել իր ուտելիքով", true),
                ),
            ),
            YesNoQuestion(
                question = "Սիբիրյան բանտերում քրեական հանցագործները ունեին ավելի շատ արտոնություններ, քան մտավորականները",
                isAnswerYes = true,
            ),
            MultipleChoiceQuestion(
                question = "Երեք րոպեանոց դատավարության արդյունքում, դատարանը ինչ որոշում կատարեց",
                options = listOf(
                    MultipleChoiceQuestion.Option("5 տարի ազատազրկում", false),
                    MultipleChoiceQuestion.Option("10 տարի ազատազրկում", true),
                    MultipleChoiceQuestion.Option("15 տարի ազատազրկում", false),
                    MultipleChoiceQuestion.Option("Ցմահ ազատազրկում", false),
                ),
            ),
            MultipleChoiceQuestion(
                question = "Ավարտեք վեպում հիշատակված խոսքը. “Քանի մենք կանք, պատմություն չի լինի, ",
                options = listOf(
                    MultipleChoiceQuestion.Option("իսկ երբ պատմություն լինի, մեզ կհիշեն որպես այն կերտողները”", false),
                    MultipleChoiceQuestion.Option(
                        "իսկ երբ պատմությունը լինի, մեր գործողությունները դաջված կլինեն նրա էջերում”",
                        false,
                    ),
                    MultipleChoiceQuestion.Option("իսկ երբ պատմություն լինի, մենք չենք լինի”", true),
                    MultipleChoiceQuestion.Option("քանի որ մենք գրում ենք մեր սեփական պատմությունը”", false),
                ),
            ),
        )
    }
}
