package griffith;

public class WreckageAndWhispers {
	//class that contains messages and the name of the game in ASCII format
	public static class MessagesData{
		//the method prints welcome message using ASCII
	public static void welcomeMessage() {
		System.out.println("                 ██████╗██╗  ██╗ ██████╗ ██╗ ██████╗███████╗                 \n"
				+ "                ██╔════╝██║  ██║██╔═══██╗██║██╔════╝██╔════╝                 \n"
				+ "                ██║     ███████║██║   ██║██║██║     █████╗                   \n"
				+ "                ██║     ██╔══██║██║   ██║██║██║     ██╔══╝                   \n"
				+ "                ╚██████╗██║  ██║╚██████╔╝██║╚██████╗███████╗                 \n"
				+ "                 ╚═════╝╚═╝  ╚═╝ ╚═════╝ ╚═╝ ╚═════╝╚══════╝                 \n"
				+ "                                                                             \n"
				+ " █████╗ ██████╗ ██╗   ██╗███████╗███╗   ██╗████████╗██╗   ██╗██████╗ ███████╗\n"
				+ "██╔══██╗██╔══██╗██║   ██║██╔════╝████╗  ██║╚══██╔══╝██║   ██║██╔══██╗██╔════╝\n"
				+ "███████║██║  ██║██║   ██║█████╗  ██╔██╗ ██║   ██║   ██║   ██║██████╔╝█████╗  \n"
				+ "██╔══██║██║  ██║╚██╗ ██╔╝██╔══╝  ██║╚██╗██║   ██║   ██║   ██║██╔══██╗██╔══╝  \n"
				+ "██║  ██║██████╔╝ ╚████╔╝ ███████╗██║ ╚████║   ██║   ╚██████╔╝██║  ██║███████╗\n"
				+ "╚═╝  ╚═╝╚═════╝   ╚═══╝  ╚══════╝╚═╝  ╚═══╝   ╚═╝    ╚═════╝ ╚═╝  ╚═╝╚══════╝");

	}
	//the method prints different victory messages depending on the chosen language
	public static void victoryMessage(int language) {
		//switch statement to print the message in the correct language 
		switch(language) {
		case 0 -> {
			System.out.println("\n██╗   ██╗██╗ ██████╗████████╗ ██████╗ ██████╗ ██╗   ██╗\n"
					+ "██║   ██║██║██╔════╝╚══██╔══╝██╔═══██╗██╔══██╗╚██╗ ██╔╝\n"
					+ "██║   ██║██║██║        ██║   ██║   ██║██████╔╝ ╚████╔╝ \n"
					+ "╚██╗ ██╔╝██║██║        ██║   ██║   ██║██╔══██╗  ╚██╔╝  \n"
					+ " ╚████╔╝ ██║╚██████╗   ██║   ╚██████╔╝██║  ██║   ██║   \n"
					+ "  ╚═══╝  ╚═╝ ╚═════╝   ╚═╝    ╚═════╝ ╚═╝  ╚═╝   ╚═╝   \n");
		}
		case 1 -> {
			System.out.println("\n#####  ###  ####  ##### #####    #  \n"
					+ "#   # #   #  #    #      #  #   # # \n"
					+ "#   # #   #  #### ####   #  #  #####\n"
					+ "#   # #   #  #  # #      ####  #   #\n"
					+ "#   #  ###  ##### ##### #    # #   #");
		}
		case 2 -> {
			System.out.println("\n##### ##### ####  ##### #   #  ###  #####   #  \n"
					+ "#   # #     #   # #     ## ## #   # #   #  # # \n"
					+ "#   # ####  ####  ####  # # # #   # #     #####\n"
					+ "#   # #     #     #     #   # #   # #     #   #\n"
					+ "#   # ##### #     ##### #   #  ###  #     #   #");
		}
		}
		
	}
	//the method prints game over message
	public static void gameOverMessage(int language) {
		switch(language) {
		case 0 -> {
			System.out.println("\n ██████╗  █████╗ ███╗   ███╗███████╗     ██████╗ ██╗   ██╗███████╗██████╗ \n"
					+ "██╔════╝ ██╔══██╗████╗ ████║██╔════╝    ██╔═══██╗██║   ██║██╔════╝██╔══██╗\n"
					+ "██║  ███╗███████║██╔████╔██║█████╗      ██║   ██║██║   ██║█████╗  ██████╔╝\n"
					+ "██║   ██║██╔══██║██║╚██╔╝██║██╔══╝      ██║   ██║╚██╗ ██╔╝██╔══╝  ██╔══██╗\n"
					+ "╚██████╔╝██║  ██║██║ ╚═╝ ██║███████╗    ╚██████╔╝ ╚████╔╝ ███████╗██║  ██║\n"
					+ " ╚═════╝ ╚═╝  ╚═╝╚═╝     ╚═╝╚══════╝     ╚═════╝   ╚═══╝  ╚══════╝╚═╝  ╚═╝\n");

		}
		case 1 -> {
			System.out.println("\n#####  ###  ####    #   # # # ##### #   # #   # #####\n"
					+ "#   # #   # #   #  # #   ###  #     #   # #  ## #    \n"
					+ "#   # #   # ####  #####   #   ####  ##### # # # #### \n"
					+ "#   # #   # #     #   #  ###  #     #   # ##  # #    \n"
					+ "#   #  ###  #     #   # # # # ##### #   # #   # #####");
		}
		case 2 -> {
			System.out.println("\n#####  ###  ####    #   ####  #   #   #  \n"
					+ "#   # #   # #   #  # #      # #  #   # # \n"
					+ "#   # #   # ####  #####  ###  ###   #####\n"
					+ "#   # #   # #     #   #     # #  #  #   #\n"
					+ "#   #  ###  #     #   # ####  #   # #   #");
		}
		}
	
}
	}
	// the class contains text for the game interface: menu, settings, clarification, exit...
	public static class GameInteerface{
		//2D array that contains text for the menu in 3 languages: eng, rus, ukr
		public static String[][] menu = {
				{
			        "\n1. Start the game",
			        "2. Speed",
			        "3. Difficulty",
			        "4. Language",
			        "5. Exit"
			    },
			    {
			        "\n1. Начать игру",
			        "2. Скорость",
			        "3. Сложность",
			        "4. Язык",
			        "5. Выход"
			    },
			    {
			        "\n1. Почати гру",
			        "2. Швидкість",
			        "3. Складність",
			        "4. Мова",
			        "5. Вихід"
			    }
			
		};
		//2D array to ask the user to press ENTER
		public static String[][] pressEnter = {
				{
			        "\nPress ENTER to return to the menu..."
			    },
			    {
			        "\nНажмите ENTER, чтобы вернуться в меню..."
			    },
			    {
			        "\nНатисніть ENTER, щоб повернутися в меню..."
			    }
		};
		//3D array that stores clarification messages for different setting: speed, difficulty, language
		public static String[][][] clarification = {
				{
					{
						"\nThe speed set to: ", "\nYou can change this later in settings"
					},
					{
						"\nСкорость установлена на: ","\nВы сможете изменить это позже в настройках"
					},
					{
						"\nШвидкість встановлена на: ","\nВи зможете змінити це пізніше в налаштуваннях"
					}	
				},
				{
					{
						"\nDifficulty set to: ", "\nYou can change this later in settings"
					},
					{
						"\nСложность установлена на: ","\nВы сможете изменить это позже в настройках"
					},
					{
						"\nСкладнiсть встановлена на: ","\nВи зможете змінити це пізніше в налаштуваннях"
					}	
				},
				{
					{
						"\nLanguage set to: ", "\nYou can change this later in settings"
					},
					{
						"\nЯзык установлен на: ","\nВы сможете изменить это позже в настройках"
					},
					{
						"\nМова встановлена на: ","\nВи зможете змінити це пізніше в налаштуваннях"
					}	
				}
				
		};
		//2D array contains text for speed settings 
		public static String[][] speed = {
				{
					"\n------------------------------",
					"     Text speed settings",
					"------------------------------\n",
			        "Choose your text speed\n",
			        "[1] Slow   (Cinematic)",
			        "[2] Normal (Default)",
			        "[3] Fast   (Instant text)"
			    },
			    {
			    	"\n-----------------------------------",
					"     Настройки скорости текста",
					"-----------------------------------\n",
			        "Выберите скорость текста\n",
			        "[1] Медленная (Кинематографичная)",
			        "[2] Обычная   (По умолчанию)",
			        "[3] Быстрая   (Мгновенный текст)"
			    },
			    {
			    	"\n--------------------------------------",
					"     Налаштування швидкості тексту",
					"--------------------------------------\n",
			        "Оберіть швидкість тексту\n",
			        "[1] Повільна (Кінематографічна)",
			        "[2] Звичайна (За замовчуванням)",
			        "[3] Швидка   (Миттєвий текст)"
			    }	
		};
		//2D array contains text for difficulty settings
		public static String[][] difficulty = {
				{
					"\n------------------------------",
					"     Difficulty settings",
					"------------------------------\n",
			        "Choose your difficulty level\n",
			        "[1] Easy       (Default, no random negative events)",
			        "[2] Normal     (40% chance of negative events)",
			        "[3] Hard       (60% chance of negative events)",
			        "[4] Impossible (70% chance of negative events)"
			    },
			    {
			    	"\n------------------------------",
					"     Настройки сложности",
					"------------------------------\n",
			        "Выберите уровень сложности\n",
			        "[1] Легкий     (По умолчанию, без случайных негативных событий)",
			        "[2] Обычный    (40% шанс негативных событий)",
			        "[3] Сложный    (60% шанс негативных событий)",
			        "[4] Невозможный (70% шанс негативных событий)"
			    },
			    {
			    	"\n---------------------------------",
					"     Налаштування складності",
					"---------------------------------\n",
			        "Оберіть рівень складності\n",
			        "[1] Легкий     (За замовчуванням, без випадкових негативних подій)",
			        "[2] Звичайний   (40% шанс негативних подій)",
			        "[3] Складний   (60% шанс негативних подій)",
			        "[4] Неможливий (70% шанс негативних подій)"
			    }
			};
		//2D array contains the text for language settings
		public static String[][] language = {
				{
					"\n------------------------------",
					"       Language settings",
					"------------------------------\n",
					"Choose the language\n",
			        "[1] English   (Default)",
			        "[2] Russian",
			        "[3] Ukrainian"
			        },
				{
					"\n------------------------------",
					"        Настройки языка",
					"------------------------------\n",
					"Выберите язык\n",
			        "[1] Английский",
			        "[2] Русский",
			        "[3] Украинский"
				},
				{
					"\n------------------------------",
					"       Налаштування мови",
					"------------------------------\n",
					"Виберiть мову \n",
			        "[1] Англiйська",
			        "[2] Російська",
			        "[3] Українська"
			    }
		
		};
		//2D array contains the text for exit
		public static String[][] exit = {
				{
					"\n------------------------------\n",
					"     Thank you for playing\n",
					"        Exiting game"
				},
				{
			        "\n------------------------------\n",
			        "      Спасибо за игру\n",
			        "      Выход из игры"
			    },
			    {
			        "\n------------------------------\n",
			        "      Дякуємо за гру\n",
			        "      Вихід з гри"
			    }
		};

		//2D array, difficulty confirmation
			public static String[][] difficultyConfirmation = {
			    { "\nDifficulty set to: " },
			    { "\nСложность установлена на: " },
			    { "\nСкладність встановлена на: " }
			};
			//2D array, hp messages
			public static String[][] hp = {
				{
				"Current HP: " ,   
				"Текущее здоровье: " ,   
				"Поточне здоров'я: "     
				},
				{
				"HP",
				"Здоровье",
				"Здоров'я"
				}
			};
		
	}

	// the class contains story text and title for Chapter 1 in 3 languages 
	public static class Chapter1{
		// 2D char array contains char arrays converted from Strings for letter-by-letter print
		public static char[][] chapter1Title = {
				("   Chapter 1: wreckage & whispers").toUpperCase().toCharArray(), 
				("      Глава 1: Обломки и шёпот").toUpperCase().toCharArray(), 
				("     Розділ 1: Уламки та шепіт").toUpperCase().toCharArray()
		};
		//Introduction to Chapter 1, each inner array represents the same scene but in different language, [0] - engl, [1] - rus, [3] - ukr 
		public static String[][] chapter1 = {{
				"You awaken, coughing saltwater, the sand rough against your cheek.",
				"Your ship, The Wanderer, is shattered wood scattered across the white-sand beach.",
				"You are the sole survivor.",
				"The island is dense jungle rising to volcanic peaks.",
				"There is no civilization.",
				"You urgently need shelter, water, and a way to signal.",
				"The sun is sinking fast.",
				"What is your immediate priority?",
				"Choice A: Scout the wreckage for supplies. (Prioritize tools from the ship.)",
				"Choice B: Head into the jungle for a secure spot and water source. (Prioritize immediate safety.)"},
				{
				"Вы приходите в себя, кашляя от соленой воды; песок царапает щеку.",
				"Ваш корабль, «Странник», превратился в груду щепок, разбросанных по белопесчаному пляжу.", 
				"Вы единственный выживший.", 
				"Остров — это густые джунгли, уходящие ввысь к вулканическим пикам.", 
				"Здесь нет цивилизации.", 
				"Вам срочно нужно укрытие, вода и способ подать сигнал.", 
				"Солнце стремительно садится.", 
				"Что является вашим первоочередным делом?", 
				"Вариант А: Обыскать обломки на наличие припасов. (Приоритет: инструменты с корабля).", 
				"Вариант B: Направиться в джунгли на поиски безопасного места и источника воды. (Приоритет: немедленная безопасность)."},
				{
				"Ви приходите до тями, кашляючи від солоної води; пісок дряпає щоку.", 
				"Ваш корабель, «Мандрівник», перетворився на купу уламків, розкиданих по білосніжному пляжу.",
				"Ви єдиний, хто вижив.", 
				"Острів — це густі джунглі, що піднімаються до вулканічних піків.", 
				"Тут немає цивілізації.",
				"Вам терміново потрібне укриття, вода та спосіб подати сигнал.", 
				"Сонце стрімко сідає.",
				"Що є вашим першочерговим завданням?", 
				"Варіант A: Оглянути уламки в пошуках припасів. (Пріоритет: інструменти з корабля).", 
				"Варіант B: Вирушити в джунглі на пошуки безпечного місця та джерела води. (Пріоритет: негайна безпека).",
				}
		};
		//Chapter 1 - Choice A
		public static String[][]chapter1A = {
			    {
			        "You search the debris line before the tide claims it.",
			        "You salvage three items: a dull machete, a waterskin, and a small, locked wooden box with a metal rattle.",
			        "You notice a faint column of smoke rising from a distant ridge to the south.",
			        "What do you do now?",
			        "Choice A: Force the lock on the wooden box immediately using the dull machete.",
			        "Choice B: Hike toward the distant smoke plume, hoping it leads to aid."
			    },
			    {
			        "Вы обыскиваете линию обломков, пока их не унесло приливом.",
			        "Вам удается спасти три предмета: затупившееся мачете, бурдюк для воды и небольшой запертый деревянный ящик, внутри которого что-то гремит.",
			        "Вы замечаете слабый столб дыма, поднимающийся над далеким хребтом на юге.",
			        "Что вы сделаете теперь?",
			        "Вариант A: Немедленно взломать замок деревянного ящика с помощью тупого мачете.",
			        "Вариант B: Отправиться к далекому столбу дыма в надежде найти помощь."
			    },
			    {
			        "Ви обшукуєте лінію уламків, поки їх не загарбав приплив.",
			        "Вам вдається врятувати три предмети: затуплене мачете, бурдюк для води та невелику замкнену дерев’яну скриньку, всередині якої щось калатає.",
			        "Ви помічаєте слабкий стовп диму, що здіймається над далеким хребтом на півдні.",
			        "Що ви зробите тепер?",
			        "Варіант A: Негайно зламати замок дерев’яної скриньки за допомогою тупого мачете.",
			        "Варіант B: Вирушити до далекого стовпа диму в надії знайти допомогу."
			    }
			};
		//Chapter 1 - Choice B
		public static String[][]chapter1B = {
				{
			        "You leave the dangerous tidal zone and push into the dense jungle.",
			        "You find a rocky stream, and two promising camp spots nearby",
			        "Spot 1: A shallow cave high on a cliff, protected from predators.",
			        "Spot 2: A natural clearing near the stream, ideal for a signaling fire. You must choose your camp for the night.",
			        "You are exhausted and must pick one place to establish your camp for the night.",
			        "What do you do now?",
			        "Choice A: Climb to the shallow cave entrance. (Prioritize defense and dry shelter.)",
			        "Choice B: Clear the natural clearing and prepare a signaling fire. (Prioritize rescue.)"
			    },
				{
			        "Вы покидаете опасную приливную зону и углубляетесь в густые джунгли.",
			        "Вы находите каменистый ручей и два подходящих места для лагеря поблизости.",
			        "Место 1: Неглубокая пещера высоко на скале, защищенная от хищников.",
			        "Место 2: Естественная поляна у ручья, идеальная для сигнального костра.",
			        "Вы измотаны и должны выбрать одно место для ночлега.",
			        "Что вы сделаете теперь?",
			        "Вариант A: Подняться к входу в пещеру. (Приоритет: защита и сухое укрытие.)",
			        "Вариант B: Расчистить поляну и подготовить сигнальный костер. (Приоритет: спасение.)"
			    },
			    {
			        "Ви залишаєте небезпечну припливну зону і вирушаєте вглиб густих джунглів.",
			        "Ви знаходите кам'янистий струмок і два підходящих місця для табору неподалік.",
			        "Місце 1: Неглибока печера високо на скелі, захищена від хижаків.",
			        "Місце 2: Природна галявина біля струмка, ідеальна для сигнального багаття.",
			        "Ви виснажені й мусите обрати одне місце для ночівлі.",
			        "Що ви зробите тепер?",
			        "Варіант A: Піднятися до входу в печеру. (Пріоритет: захист і сухе укриття.)",
			        "Варіант B: Розчистити галявину та підготувати сигнальне багаття. (Пріоритет: порятунок.)"
			    }
			};
		//Chapter 1 - Choice A - Choice A
		public static String[][] chapter1NeutralEnding = {
			    {
			        "You damage the machete opening the box, which reveals a flint and steel kit.",
			        "You lost too much time; the tide is high.",
			        "Survival is harder tonight..."
			    },
			    {
			        "Вы повредили мачете, открывая ящик, в котором оказался набор из кремня и огнива.",
			        "Вы потеряли слишком много времени; начался прилив.",
			        "Этой ночью выживать будет сложнее..."
			    },
			    {
			        "Ви пошкодили мачете, відкриваючи скриньку, в якій виявився набір із кременю та кресала.",
			        "Ви згаяли забагато часу; почався приплив.",
			        "Цієї ночі виживати буде складніше..."
			    }
			};
		    //Chapter 1 - Choice A - Choice B
			public static String[][] chapter1BestEnding = {
			    {
			        "The smoke leads not to a camp, but a natural hot spring.",
			        "The spot is perfect; you find volcanic rock to build a permanent, protective wall.",
			        "The heat wards off insects."
			    },
			    {
			        "Дым привел вас не в лагерь, а к природному горячему источнику.",
			        "Это идеальное место; вы находите вулканическую породу, чтобы построить прочную защитную стену.",
			        "Тепло отгоняет насекомых."
			    },
			    {
			        "Дим привів вас не до табору, а до природного гарячого джерела.",
			        "Це ідеальне місце; ви знаходите вулканічну породу, щоб побудувати міцну захисну стіну.",
			        "Тепло відганяє комах."
			    }
			};
			//Chapter 1 - Choice B - Choice A
			public static String[][] chapter1BadEnding = {
			    {
			        "The cave is safe, but you wake up covered in an irritating vine ('Sleepers Ivy').",
			        "Your face breaks out in a terrible rash, hindering your ability to gather food."
			    },
			    {
			        "В пещере безопасно, но вы просыпаетесь в зарослях вызывающей раздражение лианы («Плющ спящих»).",
			        "Ваше лицо покрывается ужасной сыпью, что мешает вам добывать еду."
			    },
			    {
			        "У печері безпечно, але ви прокидаєтеся в заростях ліани, що викликає подразнення («Плющ сплячих»).",
			        "Ваше обличчя вкривається жахливим висипом, що заважає вам добувати їжу."
			    }
			};
			//Chapter 1 - Choice B - Choice B
			public static String[][] chapter1GoodEnding = {
			    {
			        "You quickly build and light a signal fire.",
			        "A distant, muffled horn sound echoes across the water.",
			        "Someone saw your signal!",
			        "Rescue arrives tomorrow morning."
			    },
			    {
			        "Вы быстро разводите сигнальный костер.",
			        "Далекий, приглушенный звук горна разносится над водой.",
			        "Кто-то заметил ваш сигнал!",
			        "Помощь прибудет завтра утром."
			    },
			    {
			        "Ви швидко розпалюєте сигнальне багаття.",
			        "Далекий, глухий звук горна розноситься над водою.",
			        "Хтось помітив ваш сигнал!",
			        "Допомога прибуде завтра вранці."
			    }
			};
	}
	
		//Chapter 2 (follows the Neutral Ending)
		public static class Chapter2NeutralEndingData{
			public static char[][] chapter2NeutralEndingTitle = {
					("   Chapter 2: The Fire's Promise").toUpperCase().toCharArray(),
					("      Глава 2: Обещание огня").toUpperCase().toCharArray(),
					("     Розділ 2: Обіцянка вогню").toUpperCase().toCharArray()
					};
			public static String[][] chapter2NeutralEnding = {
				    {
				        "You have the flint and steel, but the machete is ruined.",
				        "Darkness has set in, and you lack proper shelter.",
				        "You manage a small fire, but you need food and defense by morning.",
				        "You must choose between two risky ventures:",
				        "climbing a small waterfall for edible moss, or searching the tide pools for shellfish.",
				        "What is your immediate course of action upon sunrise?",
				        "Choice A: Climb the waterfall for moss. (Prioritize high-calorie food, risking a fall.)",
				        "Choice B: Search the tide pools for shellfish. (Prioritize easy food, risking the returning tide.)"
				    },
				    {
				        "У вас есть кремень и огниво, но мачете безнадежно испорчено.",
				        "Наступила темнота, а у вас нет подходящего укрытия.",
				        "Вам удается развести небольшой костер, но к утру понадобятся еда и защита.",
				        "Вы должны выбрать между двумя рискованными затеями:",
				        "подняться по небольшому водопаду за съедобным мхом или искать моллюсков в приливных лужах.",
				        "Каковы ваши действия с наступлением рассвета?",
				        "Вариант A: Полезть на водопад за мхом. (Приоритет: калорийная еда, риск падения.)",
				        "Вариант B: Искать моллюсков в приливных лужах. (Приоритет: легкая добыча, риск прилива.)"
				    },
				    {
				        "У вас є кремінь і кресало, але мачете безнадійно зіпсоване.",
				        "Настала темрява, а у вас немає належного укриття.",
				        "Вам вдається розпалити невелике багаття, але до ранку знадобляться їжа та захист.",
				        "Ви мусите обрати між двома ризикованими справами:",
				        "піднятися по невеликому водоспаду за їстівним мохом або шукати молюсків у припливних калюжах.",
				        "Якою буде ваша перша дія зі сходом сонця?",
				        "Варіант A: Полізти на водоспад за мохом. (Пріоритет: калорійна їжа, ризик падіння.)",
				        "Варіант B: Шукати молюсків у припливних калюжах. (Пріоритет: легка здобич, ризик припливу.)"
				    }
				};

				public static String[][] chapter2NeutralEndingA = {
				    {
				        "The wet rock is treacherous.",
				        "Halfway up, you slip, but your hand catches on a narrow wooden ledge supporting a small, dry, leather satchel.",
				        "What do you do now?",
				        "Choice A: Climb the rest of the way to reach the moss before retrieving the satchel.",
				        "Choice B: Open the satchel immediately while balanced precariously on the ledge."
				    },
				    {
				        "Мокрый камень очень коварен.",
				        "На полпути вы поскальзываетесь, но рука цепляется за узкий деревянный выступ, на котором лежит небольшая сухая кожаная сумка.",
				        "Что вы сделаете теперь?",
				        "Вариант A: Пройти оставшийся путь до мха, прежде чем забрать сумку.",
				        "Вариант B: Немедленно открыть сумку, балансируя на опасном выступе."
				    },
				    {
				        "Мокрий камінь дуже підступний.",
				        "На півдорозі ви посковзуєтеся, але рука чіпляється за вузький дерев’яний виступ, на якому лежить невелика суха шкіряна сумка.",
				        "Що ви зробите тепер?",
				        "Варіант A: Пройти решту шляху до моху, перш ніж забрати сумку.",
				        "Варіант B: Негайно відкрити сумку, балансуючи на небезпечному виступі."
				    }
				};

				public static String[][] chapter2NeutralEndingB = {
				    {
				        "The tide pools yield enough food for the day.",
				        "You notice a strange, intricate bronze mechanism in a deep pool.",
				        "You hear the tide beginning to turn, signaling the water's imminent return.",
				        "What do you do now?",
				        "Choice A: Work quickly to pry the bronze mechanism loose. (Risk the incoming tide for a unique tool.)",
				        "Choice B: Leave the mechanism and run back to safety with your food."
				    },
				    {
				        "Приливные лужи дают достаточно еды на день.",
				        "В глубокой луже вы замечаете странный, сложный бронзовый механизм.",
				        "Вы слышите, как начинается прилив, сигнализируя о скором возвращении воды.",
				        "Что вы сделаете теперь?",
				        "Вариант A: Попытаться быстро вытащить бронзовый механизм. (Рискнуть попасть в прилив ради уникального инструмента.)",
				        "Вариант B: Бросить механизм и бежать в безопасное место с едой."
				    },
				    {
				        "Припливні калюжі дають достатньо їжі на день.",
				        "У глибокій калюжі ви помічаєте дивний, складний бронзовий механізм.",
				        "Ви чуєте, як починається приплив, що сигналізує про швидке повернення води.",
				        "Що ви зробите тепер?",
				        "Варіант A: Спробувати швидко витягнути бронзовий механізм. (Ризикнути потрапити в приплив заради унікального інструменту.)",
				        "Варіант B: Залишити механізм і бігти в безпечне місце з їжею."
				    }
				};

				public static String[][] chapter2HardenedSurvivor = {
				    {
				        "You get the moss, but fall and lose the satchel while descending.",
				        "It contained a flare gun.",
				        "You survived and ate, but lost your only chance at a quick signal."
				    },
				    {
				        "Вы добыли мох, но при спуске упали и потеряли сумку.",
				        "В ней была ракетница.",
				        "Вы выжили и поели, но упустили единственный шанс быстро подать сигнал."
				    },
				    {
				        "Ви здобули мох, але під час спуску впали і втратили сумку.",
				        "У ній була ракетниця.",
				        "Ви вижили і поїли, але втратили єдиний шанс швидко подати сигнал."
				    }
				};

				public static String[][] chapter2LuckyBreak = {
				    {
				        "Inside is a water-activated, long-range beacon.",
				        "Your fall activates it immediately.",
				        "A vessel rescues you, but the fall severely breaks your leg."
				    },
				    {
				        "Внутри оказывается дальнобойный маяк, активируемый водой.",
				        "Ваше падение немедленно приводит его в действие.",
				        "Судно спасает вас, но при падении вы серьезно ломаете ногу."
				    },
				    {
				        "Всередині виявляється далекобійний маяк, що активується водою.",
				        "Ваше падіння негайно приводить його в дію.",
				        "Судно рятує вас, але під час падіння ви серйозно ламаєте ногу."
				    }
				};

				public static String[][] chapter2TidesToll = {
				    {
				        "You work too long.",
				        "The tide sweeps you out and traps you against the rocks."
				    },
				    {
				        "Вы провозились слишком долго.",
				        "Прилив уносит вас в море и прижимает к скалам."
				    },
				    {
				        "Ви прокопалися занадто довго.",
				        "Приплив виносить вас у море і притискає до скель."
				    }
				};

				public static String[][] chapter2PracticalSuccess = {
				    {
				        "You safely escape the tide with food.",
				        "The energy allows you to build a massive signal fire days later.",
				        "A passing ship sees the smoke and rescues you."
				    },
				    {
				        "Вы благополучно спасаетесь от прилива с едой.",
				        "Запас сил позволяет вам спустя несколько дней развести огромный сигнальный костер.",
				        "Проходящий мимо корабль видит дым и спасает вас."
				    },
				    {
				        "Ви благополучно рятуєтеся від припливу з їжею.",
				        "Запас сил дозволяє вам через кілька днів розпалити величезне сигнальне багаття.",
				        "Корабель, що проходив повз, бачить дим і рятує вас."
				    }
				};
		}
		
		//Chapter 2 (follows the Best Ending)
		public static class Chapter2BestEndingData {
			public static char[][] chapter2BestEndingTitle = {
					("    Chapter 2: The Hot Spring Enigma").toUpperCase().toCharArray(),
					("   Глава 2: Загадка горячего источника").toUpperCase().toCharArray(),
					("   Розділ 2: Загадка гарячого джерела").toUpperCase().toCharArray()
					};
			public static String[][] chapter2BestEnding = {
				    {
				        "You have a perfect base at the hot springs.",
				        "After two days, you must explore to find inhabitants or danger.",
				        "You decide your first route:",
				        "follow the stream to the coastal mangrove swamps, or ascend higher to the mountain ridge where the spring originates.",
				        "What is your immediate course of action?",
				        "Choice A: Descend toward the mangrove swamps. (Risk navigation difficulty for potential coastal access.)",
				        "Choice B: Ascend to the mountain ridge. (Risk dangerous terrain for a broader view.)"
				    },
				    {
				        "У вас есть идеальная база у горячих источников.",
				        "Через два дня вам приходится отправиться на разведку, чтобы найти жителей или обнаружить опасность.",
				        "Вы выбираете свой первый маршрут:",
				        "следовать вдоль ручья к прибрежным мангровым болотам или подняться выше к горному хребту, где берет начало источник.",
				        "Каковы ваши дальнейшие действия?",
				        "Вариант A: Спуститься к мангровым болотам. (Риск трудностей в навигации ради потенциального выхода к берегу.)",
				        "Вариант B: Подняться на горный хребет. (Риск опасного рельефа ради более широкого обзора.)"
				    },
				    {
				        "У вас є ідеальна база біля гарячих джерел.",
				        "Через два дні вам доводиться вирушити на розвідку, щоб знайти мешканців або виявити небезпеку.",
				        "Ви обираєте свій перший маршрут:",
				        "йти вздовж струмка до прибережних мангрових боліт або піднятися вище до гірського хребта, де бере початок джерело.",
				        "Якою буде ваша наступна дія?",
				        "Варіант A: Спуститися до мангрових боліт. (Ризик труднощів у навігації заради потенційного виходу до берега.)",
				        "Варіант B: Піднятися на гірський хребет. (Ризик небезпечного рельєфу заради ширшого огляду.)"
				    }
				};

				public static String[][] chapter2BestEndingA = {
				    {
				        "The mangroves are a maze of mud.",
				        "You find the remains of a small, old wooden fishing vessel.",
				        "Near the wreck, a tribal symbol is carved into a dead tree.",
				        "The island is inhabited.",
				        "What do you do now?",
				        "Choice A: Quietly hide and observe the area for any sign of the inhabitants.",
				        "Choice B: Attempt to use the fishing vessel's mast as a signal pole by attaching debris."
				    },
				    {
				        "Мангры — это лабиринт из грязи.",
				        "Вы находите останки небольшого старого деревянного рыболовного судна.",
				        "Рядом с обломками на мертвом дереве вырезан племенной символ.",
				        "Остров обитаем.",
				        "Что вы сделаете теперь?",
				        "Вариант A: Тихо спрятаться и наблюдать за местностью в поисках признаков жителей.",
				        "Вариант B: Попытаться использовать мачту рыболовного судна как сигнальный шест, прикрепив к нему обломки."
				    },
				    {
				        "Мангри — це лабіринт із багнюки.",
				        "Ви знаходите затишки невеликого старого дерев’яного рибальського судна.",
				        "Поруч із уламками на мертвому дереві викарбувано племінний символ.",
				        "Острів населений.",
				        "Що ви зробите тепер?",
				        "Варіант A: Тихо сховатися і спостерігати за місцевістю в пошуках ознак мешканців.",
				        "Варіант B: Спробувати використати щоглу рибальського судна як сигнальну жердину, прикріпивши до неї уламки."
				    }
				};

				public static String[][] chapter2BestEndingB = {
				    {
				        "The climb is difficult, but you gain a clear view of the island.",
				        "You spot a secluded valley on the north side, completely hidden from the sea.",
				        "Within the valley, you see the outline of large, unnatural structures hidden beneath the canopy.",
				        "What do you do now?",
				        "Choice A: Descend immediately toward the secluded valley to investigate the structures.",
				        "Choice B: Return to your hot spring base to gather supplies and prepare for a long expedition."
				    },
				    {
				        "Подъем труден, но перед вами открывается ясный вид на остров.",
				        "На северной стороне вы замечаете уединенную долину, полностью скрытую от моря.",
				        "В долине под кронами деревьев виднеются очертания крупных искусственных сооружений.",
				        "Что вы сделаете теперь?",
				        "Вариант A: Немедленно спуститься в долину, чтобы изучить постройки.",
				        "Вариант B: Вернуться на базу у горячего источника, чтобы собрать припасы и подготовиться к долгой экспедиции."
				    },
				    {
				        "Підйом важкий, але перед вами відкривається чистий краєвид на острів.",
				        "На північній стороні ви помічаєте самотню долину, повністю приховану від моря.",
				        "У долині під кронами дерев видніються обриси великих штучних споруд.",
				        "Що ви зробите тепер?",
				        "Варіант A: Негайно спуститися в долину, щоб вивчити споруди.",
				        "Варіант B: Повернутися до бази біля гарячого джерела, щоб зібрати припаси та підготуватися до тривалої експедиції."
				    }
				};

				public static String[][] chapter2SecretKeeper = {
				    {
				        "You spot quiet indigenous people.",
				        "They approach, offering fish and escape in exchange for your silence about their location."
				    },
				    {
				        "Вы замечаете неразговорчивых коренных жителей.",
				        "Они подходят к вам и предлагают рыбу и способ покинуть остров в обмен на ваше молчание о месте их проживания."
				    },
				    {
				        "Ви помічаєте мовчазних корінних жителів.",
				        "Вони підходять до вас і пропонують рибу та можливість покинути острів в обмін на ваше мовчання про їхнє місцезнаходження."
				    }
				};

				public static String[][] chapter2Prisoner = {
				    {
				        "The signal attracts the inhabitants.",
				        "They view it as an invasion and take you captive, planning to keep you permanently to protect the island's secret."
				    },
				    {
				        "Сигнал привлекает жителей острова.",
				        "Они расценивают это как вторжение и берут вас в плен, намереваясь оставить вас навсегда, чтобы сохранить тайну острова."
				    },
				    {
				        "Сигнал привертає увагу мешканців острова.",
				        "Вони розцінюють це як вторгнення і беруть вас у полон, плануючи залишити вас назавжди, щоб зберегти таємницю острова."
				    }
				};

				public static String[][] chapter2Consultant = {
				    {
				        "You sneak into the valley and discover an abandoned, high-tech research facility.",
				        "You activate the satellite link and send a message.",
				        "You are rescued by a government agency and hired as an expert consultant."
				    },
				    {
				        "Вы прокрадываетесь в долину и обнаруживаете заброшенный высокотехнологичный исследовательский центр.",
				        "Вы активируете спутниковую связь и отправляете сообщение.",
				        "Вас спасает государственное агентство и нанимает в качестве эксперта-консультанта."
				    },
				    {
				        "Ви прокрадаєтеся в долину і виявляєте покинутий високотехнологічний дослідницький центр.",
				        "Ви активуєте супутниковий зв'язок і надсилаєте повідомлення.",
				        "Вас рятує державне агентство і наймає як експерта-консультанта."
				    }
				};

				public static String[][] chapter2Prospector = {
				    {
				        "While gathering supplies, a landslide exposes a large vein of pure gold.",
				        "You realize the wealth is too valuable.",
				        "You decide to hide your discovery and wait for a freighter, planning your life as a secret millionaire."
				    },
				    {
				        "Пока вы собирали припасы, оползень обнажил огромную жилу чистого золота.",
				        "Вы понимаете, что это богатство слишком ценно.",
				        "Вы решаете скрыть свою находку и ждать грузовое судно, планируя жизнь тайного миллионера."
				    },
				    {
				        "Поки ви збирали припаси, зсув оголив величезну жилу чистого золота.",
				        "Ви розумієте, що це багатство надто цінне.",
				        "Ви вирішуєте приховати свою знахідку і чекати на вантажне судно, плануючи життя таємного мільйонера."
				    }
				};
		}
		
		//Chapter 2 (follows the Bad Ending)
		public static class Chapter2BadEndingData {
			public static char[][] chapter1BadEndingTitle = {
					("   Chapter 2: The Blighted Path").toUpperCase().toCharArray(),
					("      Глава 2: Гиблый путь").toUpperCase().toCharArray(),
					("     Розділ 2: Згубний шлях").toUpperCase().toCharArray(),
					
			};
			public static String[][] chapter2BadEnding = {
				    {
				        "You wake up in the cave, your skin ravaged by a painful 'Sleepers Ivy' rash.",
				        "The rash makes handling tools impossible.",
				        "Survival is now a battle against your failing health.",
				        "You must find a remedy immediately.",
				        "You know two options:",
				        "an anti-inflammatory root near the high volcanic steam vents, or a calming clay poultice near the tidal river mouth.",
				        "What is your immediate course of action?",
				        "Choice A: Hike toward the high volcanic ridge for the anti-inflammatory root. (A difficult climb for a full cure, risking exhaustion.)",
				        "Choice B: Descend toward the tidal river mouth for the calming clay. (An easier walk for temporary relief, risking infection.)"
				    },
				    {
				        "Вы просыпаетесь в пещере, ваша кожа поражена болезненной сыпью от «Плюща спящих».",
				        "Из-за сыпи пользоваться инструментами невозможно.",
				        "Выживание превращается в битву за ваше слабеющее здоровье.",
				        "Вам необходимо немедленно найти лекарство.",
				        "Вам известны два варианта:",
				        "противовоспалительный корень возле высоких вулканических фумарол или успокаивающая глиняная припарка в устье приливной реки.",
				        "Каковы ваши дальнейшие действия?",
				        "Вариант A: Отправиться к высокому вулканическому хребту за противовоспалительным корнем. (Трудный подъем ради полного исцеления, риск истощения.)",
				        "Вариант B: Спуститься к устью реки за успокаивающей глиной. (Более легкий путь ради временного облегчения, риск инфекции.)"
				    },
				    {
				        "Ви прокидаєтеся в печері, ваша шкіра уражена болючим висипом від «Плюща сплячих».",
				        "Через висип користуватися інструментами неможливо.",
				        "Виживання перетворюється на битву за ваше слабнуче здоров'я.",
				        "Вам необхідно негайно знайти ліки.",
				        "Вам відомі два варіанти:",
				        "протизапальний корінь біля високих вулканічних фумарол або заспокійлива глиняна припарка в гирлі припливної річки.",
				        "Якою буде ваша наступна дія?",
				        "Варіант A: Вирушити до високого вулканічного хребта за протизапальним коренем. (Важкий підйом заради повного зцілення, ризик виснаження.)",
				        "Варіант B: Спуститися до гирла річки за заспокійливою глиною. (Легший шлях заради тимчасового полегшення, ризик інфекції.)"
				    }
				};

				public static String[][] chapter2BadEndingA = {
				    {
				        "The grueling climb chafes your raw skin, but the dry air offers slight relief.",
				        "You reach the vents and locate the reddish root.",
				        "As you prepare the medicine, you hear an unsettling, mechanical hum coming from a narrow, dark crevice nearby.",
				        "What do you do now?",
				        "Choice A: Investigate the mechanical hum in the crevice. (Risk injury for potential discovery.)",
				        "Choice B: Take your medicine immediately and descend, ignoring the strange sound. (Prioritize health and retreat.)"
				    },
				    {
				        "Изнурительный подъем раздражает воспаленную кожу, но сухой воздух приносит небольшое облегчение.",
				        "Вы добираетесь до фумарол и находите красноватый корень.",
				        "Пока вы готовите лекарство, вы слышите тревожный механический гул, исходящий из узкой темной расщелины неподалеку.",
				        "Что вы сделаете теперь?",
				        "Вариант A: Осмотреть расщелину и источник гула. (Риск получить травму ради возможного открытия.)",
				        "Вариант B: Немедленно принять лекарство и спуститься, проигнорировав странный звук. (Приоритет: здоровье и отступление.)"
				    },
				    {
				        "Виснажливий підйом подразнює запалену шкіру, але сухе повітря приносить невелике полегшення.",
				        "Ви дістаєтеся до фумарол і знаходите червонуватий корінь.",
				        "Поки ви готуєте ліки, ви чуєте тривожне механічне гудіння, що лунає з вузької темної розщелини неподалік.",
				        "Що ви зробите тепер?",
				        "Варіант A: Оглянути розщелину та джерело гудіння. (Ризик отримати травму заради можливого відкриття.)",
				        "Варіант B: Негайно прийняти ліки та спуститися, проігнорувавши дивний звук. (Пріоритет: здоров'я та відступ.)"
				    }
				};

				public static String[][] chapter2BadEndingB = {
				    {
				        "The walk is easier, but the low-land humidity makes the rash unbearable.",
				        "You find and apply the cool, gray clay for instant relief.",
				        "While resting, you spot a rusted, angular piece of metal wreckage half-buried in the mud—it looks like part of an antenna.",
				        "What do you do now?",
				        "Choice A: Attempt to dig up and clean the metal wreckage. (Risk infection and time for a potential signal tool.)",
				        "Choice B: Leave the wreckage and immediately establish a base camp while the clay provides relief. (Prioritize shelter construction.)"
				    },
				    {
				        "Идти легче, но влажность в низине делает зуд от сыпи невыносимым.",
				        "Вы находите и наносите прохладную серую глину, что приносит мгновенное облегчение.",
				        "Во время отдыха вы замечаете застрявший в грязи ржавый угловатый обломок металла — он похож на часть антенны.",
				        "Что вы сделаете теперь?",
				        "Вариант A: Попытаться выкопать и очистить обломок. (Риск занести инфекцию и потерять время ради возможного средства связи.)",
				        "Вариант B: Оставить обломок и немедленно обустроить лагерь, пока глина дает облегчение. (Приоритет: строительство укрытия.)"
				    },
				    {
				        "Йти легше, але вологість у низині робить свербіж від висипу нестерпним.",
				        "Ви знаходите та наносите прохолодну сіру глину, що приносить миттєве полегшення.",
				        "Під час відпочинку ви помічаєте в багнюці іржавий незграбний уламок металу — він схожий на частину антени.",
				        "Що ви зробите тепер?",
				        "Варіант A: Спробувати викопати та очистити уламок. (Ризик занести інфекцію та згаяти час заради можливого засобу зв'язку.)",
				        "Варіант B: Залишити уламок і негайно облаштувати табір, поки глина дає полегшення. (Пріоритет: будівництво укриття.)"
				    }
				};

				public static String[][] chapter2Catalyst = {
				    {
				        "The sound leads to a hidden chamber with a wrecked, futuristic drone.",
				        "You repair its beacon and send an immediate SOS.",
				        "You are rescued the next day, bringing back technology that proves the island is a covert research site."
				    },
				    {
				        "Звук приводит вас в скрытую пещеру с обломками футуристического дрона.",
				        "Вы чините его маяк и немедленно отправляете сигнал SOS.",
				        "Вас спасают на следующий день, а найденные технологии доказывают, что остров является секретным исследовательским объектом."
				    },
				    {
				        "Звук приводить вас до прихованої печери з уламками футуристичного дрона.",
				        "Ви ремонтуєте його маяк і негайно надсилаєте сигнал SOS.",
				        "Вас рятують наступного дня, а знайдені технології доводять, що острів є секретним дослідницьким об'єктом."
				    }
				};

				public static String[][] chapter2PatientSurvivor = {
				    {
				        "The powerful root clears the rash completely within 24 hours.",
				        "You establish a sturdy camp and survive for weeks, eventually flagging down a distant freighter.",
				        "You are saved, but the island's secret remains hidden."
				    },
				    {
				        "Целебный корень полностью избавляет от сыпи за 24 часа.",
				        "Вы обустраиваете надежный лагерь и выживаете в течение нескольких недель, пока вам не удается подать сигнал проходящему мимо сухогрузу.",
				        "Вы спасены, но тайна острова остается нераскрытой."
				    },
				    {
				        "Цілющий корінь повністю позбавляє висипу за 24 години.",
				        "Ви облаштовуєте надійний табір і виживаєте протягом кількох тижнів, доки вам не вдається подати сигнал суховантажу, що проходив повз.",
				        "Ви врятовані, але таємниця острова залишається нерозкритою."
				    }
				};

				public static String[][] chapter2Downfall = {
				    {
				        "The digging causes the rash to become infected and spread rapidly.",
				        "Your fever rises, and you become delirious.",
				        "The device is just scrap.",
				        "You are never able to recover or signal for help."
				    },
				    {
				        "Раскопки приводят к заражению, и сыпь начинает быстро распространяться.",
				        "У вас поднимается жар, начинается бред.",
				        "Устройство оказывается обычным металлоломом.",
				        "Вы так и не сможете оправиться или позвать на помощь."
				    },
				    {
				        "Розкопки призводять до зараження, і висип починає швидко поширюватися.",
				        "У вас піднімається жар, починається марення.",
				        "Пристрій виявляється звичайним металобрухтом.",
				        "Ви так і не зможете одужати або покликати на допомогу."
				    }
				};

				public static String[][] chapter2Hermit = {
				    {
				        "You use the clay's relief to build a reliable shelter and water collector.",
				        "You manage the rash over months.",
				        "However, without a strong signal, long isolation causes lasting mental trauma before a search plane finally spots you."
				    },
				    {
				        "Пока глина дает облегчение, вы строите надежное укрытие и сборщик воды.",
				        "Вам удается сдерживать сыпь на протяжении месяцев.",
				        "Однако отсутствие сильного сигнала и долгая изоляция наносят тяжелую психологическую травму до того, как поисковый самолет наконец замечает вас."
				    },
				    {
				        "Поки глина дає полегшення, ви будуєте надійне укриття та збирач води.",
				        "Вам вдається стримувати висип протягом місяців.",
				        "Однак відсутність сильного сигналу та тривала ізоляція завдають важкої психологічної травми до того, як пошуковий літак нарешті помічає вас."
				    }
				};
		}
		
		//Chapter 2 (follows the Good Ending)
		public static class Chapter2GoodEndingData {
		public static char[][] chapter1GoodEndingTitle = {
				("   Chapter 2: The Wreck of the Aegis").toUpperCase().toCharArray(),
				("       Глава 2: Обломки «Эгиды»").toUpperCase().toCharArray(),
				("      Розділ 2: Уламки «Егіди»").toUpperCase().toCharArray(),
				
				};
		public static String[][] chapter2GoodEnding = {
			    {
			        "The next morning, a longboat from The Aegis rows ashore.",
			        "Captain Lyra helps you aboard and sails away, sharing grave news:",
			        "they seek sensitive cargo lost from their fleet, and the waters are dangerous.",
			        "Suddenly, a violent squall hits The Aegis.",
			        "A massive wave slams the deck, throwing you toward the railing.",
			        "What do you do?",
			        "Choice A: Grab the lifeline. (Prioritize your own immediate safety.)",
			        "Choice B: Help Captain Lyra secure the wheel. (Prioritize the safety of the entire ship.)"
			    },
			    {
			        "На следующее утро к берегу причаливает шлюпка с корабля «Эгида».",
			        "Капитан Лира помогает вам подняться на борт и сообщает мрачные новости:",
			        "они ищут секретный груз, утерянный их флотом, и эти воды крайне опасны.",
			        "Внезапно на «Эгиду» налетает яростный шквал.",
			        "Массивная волна обрушивается на палубу, отбрасывая вас к перилам.",
			        "Что вы сделаете?",
			        "Вариант A: Ухватиться за спасательный леер. (Приоритет: ваша личная безопасность.)",
			        "Вариант B: Помочь капитану Лире удержать штурвал. (Приоритет: безопасность всего корабля.)"
			    },
			    {
			        "Наступного ранку до берега причалює човен із корабля «Егіда».",
			        "Капітан Ліра допомагає вам піднятися на борт і ділиться тривожними новинами:",
			        "вони шукають секретний вантаж, втрачений їхнім флотом, і ці води дуже небезпечні.",
			        "Раптово на «Егіду» налітає лютий шквал.",
			        "Масивна хвиля вдаряє в палубу, відкидаючи вас до поручнів.",
			        "Що ви зробите?",
			        "Варіант A: Вхопитися за рятувальний леєр. (Пріоритет: ваша власна безпека.)",
			        "Варіант B: Допомогти капітану Лірі втримати штурвал. (Пріоритет: безпека всього корабля.)"
			    }
			};

			public static String[][] chapter2GoodEndingA = {
			    {
			        "You secure yourself against the storm.",
			        "The wave passes, and Lyra stabilizes the ship, but the damage is done.",
			        "The lookout screams, \"Rocks, dead ahead!\"",
			        "The ship strikes a coral reef.",
			        "You are thrown into the churning water near the wreckage, spotting a heavy, locked strongbox",
			        "the sensitive cargo is sinking just out of reach.",
			        "What do you do now?",
			        "Choice A: Swim hard for the sinking strongbox. (Retrieve the sensitive cargo at all costs.)",
			        "Choice B: Look for Captain Lyra and prioritize survival. (Find immediate safety.)"
			    },
			    {
			        "Вы надежно закрепляетесь, спасаясь от шторма.",
			        "Волна проходит, и Лира стабилизирует судно, но ущерб уже нанесен.",
			        "Наблюдатель кричит: «Камни прямо по курсу!»",
			        "Корабль налетает на коралловый риф.",
			        "Вас выбрасывает в бушующую воду рядом с обломками, где вы замечаете тяжелый запертый ящик",
			        "тот самый секретный груз идет ко дну совсем рядом.",
			        "Что вы сделаете теперь?",
			        "Вариант A: Изо всех сил плыть к тонущему ящику. (Вернуть секретный груз любой ценой.)",
			        "Вариант B: Искать капитана Лиру и сосредоточиться на выживании. (Приоритет: безопасность.)"
			    },
			    {
			        "Ви надійно закріплюєтеся, рятуючись від шторму.",
			        "Хвиля проходить, і Ліра стабілізує судно, але шкоди вже завдано.",
			        "Спостерігач кричить: «Каміння прямо за курсом!»",
			        "Корабель налітає на кораловий риф.",
			        "Вас викидає в бурхливу воду поруч із уламками, де ви помічаєте важку замкнену скриню",
			        "той самий секретний вантаж іде на дно зовсім поруч.",
			        "Що ви зробите тепер?",
			        "Варіант A: З усіх сил пливти до тонучої скрині. (Повернути секретний вантаж будь-якою ціною.)",
			        "Варіант B: Шукати капітана Ліру і зосередитися на виживанні. (Пріоритет: безпека.)"
			    }
			};

			public static String[][] chapter2GoodEndingB = {
			    {
			        "You rush to Captain Lyra and help lock the wheel against the waves, preventing an immediate capsize.",
			        "However, a snapped rigging hits your shoulder.",
			        "Lyra shouts that the main mast is compromised; the ship won't last.",
			        "She points to a small, enclosed escape boat and orders you:",
			        "\"Take the medical supplies! Go!\"",
			        "You spot a coil of rope, it could secure the mast temporarily, potentially saving the ship, but delaying your escape.",
			        "What do you do now?",
			        "Choice A: Grab the medical supplies and abandon ship. (Obey the Captain and save yourself and supplies.)",
			        "Choice B: Use the rope to lash the mast one last time. (Attempt to save the Captain and ship, defying the order.)"
			    },
			    {
			        "Вы бросаетесь к капитану Лире и помогаете удержать штурвал, предотвращая немедленное опрокидывание.",
			        "Однако лопнувший такелаж ударяет вас по плечу.",
			        "Лира кричит, что грот-мачта повреждена; корабль долго не продержится.",
			        "Она указывает на маленькую закрытую спасательную шлюпку и приказывает вам:",
			        "«Бери медикаменты! Уходи!»",
			        "Вы замечаете моток веревки, которым можно временно закрепить мачту, спасая корабль, но это задержит ваш побег.",
			        "Что вы сделаете теперь?",
			        "Вариант A: Взять медикаменты и покинуть корабль. (Повиноваться капитану, спасая себя и припасы.)",
			        "Вариант B: Использовать веревку, чтобы в последний раз закрепить мачту. (Попытаться спасти капитана и корабль, нарушив приказ.)"
			    },
			    {
			        "Ви кидаєтеся до капітана Ліри і допомагаєте втримати штурвал, запобігаючи негайному перекиданню.",
			        "Проте обірваний такелаж вдаряє вас по плечу.",
			        "Ліра кричить, що грот-щогла пошкоджена; корабель довго не протримається.",
			        "Вона вказує на невеликий закритий рятувальний човен і наказує вам:",
			        "«Бери медикаменти! Йди!»",
			        "Ви помічаєте моток мотузки, яким можна тимчасово закріпити щоглу, рятуючи корабель, але це затримає вашу втечу.",
			        "Що ви зробите тепер?",
			        "Варіант A: Взяти медикаменти та покинути корабель. (Покоритися капітану, рятуючи себе та припаси.)",
			        "Варіант B: Використати мотузку, щоб востаннє закріпити щоглу. (Спробувати врятувати капітана та корабель, порушивши наказ.)"
			    }
			};

			public static String[][] chapter2Sentinel = {
			    {
			        "You pull the strongbox—containing maps and encrypted codes, ashore on a deserted strip of sand.",
			        "You saved the vital mission",
			        "but you are alone, injured, and permanently stranded guarding a secret."
			    },
			    {
			        "Вы вытаскиваете ящик с картами и зашифрованными кодами на пустынный берег.",
			        "Вы спасли важную миссию,",
			        "но остались один, ранены и навсегда застряли здесь, охраняя тайну."
			    },
			    {
			        "Ви витягуєте скриню з картами та зашифрованими кодами на пустельний берег.",
			        "Ви врятували важливу місію,",
			        "але залишилися наодинці, поранені та назавжди застрягли тут, охороняючи таємницю."
			    }
			};

			public static String[][] chapter2Survivor = {
			    {
			        "You find Lyra clinging to debris, and together you reach an outcropping.",
			        "The Aegis sinks completely.",
			        "A fishing vessel later rescues you.",
			        "The sensitive cargo is lost, causing a serious security breach for the kingdom."
			    },
			    {
			        "Вы находите Лиру, цепляющуюся за обломки, и вместе выбираетесь на скалистый выступ.",
			        "«Эгида» полностью идет ко дну.",
			        "Позже вас спасает рыболовное судно.",
			        "Секретный груз утерян, что наносит серьезный удар по безопасности королевства."
			    },
			    {
			        "Ви знаходите Ліру, яка тримається за уламки, і разом вибираєтеся на скелястий виступ.",
			        "«Егіда» повністю йде на дно.",
			        "Пізніше вас рятує рибальське судно.",
			        "Секретний вантаж втрачено, що завдає серйозного удару по безпеці королівства."
			    }
			};

			public static String[][] chapter2DisgracedHero = {
			    {
			        "You escape with the medical supplies just as the mast crashes.",
			        "You are rescued by a naval vessel, but you are court-martialed for disobeying the order to stay with the crew.",
			        "Despite saving the supplies and Lyra's life."
			    },
			    {
			        "Вы спасаетесь с медикаментами как раз в тот момент, когда рушится мачта.",
			        "Вас подбирает военное судно, но вы предстаете перед трибуналом за нарушение приказа оставаться с командой.",
			        "Несмотря на спасенные жизни и припасы."
			    },
			    {
			        "Ви рятуєтеся з медикаментами саме в той момент, коли щогла падає.",
			        "Вас підбирає військове судно, але ви постаєте перед трибуналом за порушення наказу залишатися з командою.",
			        "Незважаючи на врятовані життя та припаси."
			    }
			};

			public static String[][] chapter2TrueCaptain = {
			    {
			        "Your quick action holds the mast for ten critical minutes.",
			        "Lyra and most of the crew deploy larger lifeboats and are saved.",
			        "You also recover a waterlogged logbook detailing the cargo's location.",
			        "You return a hero."
			    },
			    {
			        "Ваши быстрые действия удерживают мачту в течение десяти критических минут.",
			        "Лира и большая часть команды успевают спустить шлюпки и спастись.",
			        "Вы также находите промокший бортовой журнал с координатами груза.",
			        "Вы возвращаетесь героем."
			    },
			    {
			        "Ваші швидкі дії утримують щоглу протягом десяти критичних хвилин.",
			        "Ліра та більша частина команди встигають спустити човни і врятуватися.",
			        "Ви також знаходите промоклий бортовий журнал із координатами вантажу.",
			        "Ви повертаєтеся героєм."
			    }
			};	
		}
		//Chapter 3 (follows the Hardened Survivor Ending)
		public static class Chapter3HardenedSurvivorData {
			public static char[][] chapter3HardenedSurvivorTitle = {
					("   Chapter 3: The Persistent Island").toUpperCase().toCharArray(),
					("        Глава 3: Стойкий остров").toUpperCase().toCharArray(),
					("       Розділ 3: Стійкий острів").toUpperCase().toCharArray(),
			};
			public static String[][] chapter3HardenedSurvivor = {
				    {
				        "You are alone, injured, and deeply exhausted.",
				        "You have minimal food and no way to signal.",
				        "You need to gamble on a desperate move to survive.",
				        "Your only hope is a large, predatory bird's nest visible on a high cliff (potential food/feathers for a signal)",
				        "or a makeshift raft built from shoreline debris (risking the open sea).",
				        "What is your desperate move?",
				        "Choice A: Attempt the climb to the bird's nest. (Risk serious injury for high-reward food/materials.)",
				        "Choice B: Launch the makeshift raft. (Risk the elements for a chance at being spotted at sea.)"
				    },
				    {
				        "Вы одиноки, ранены и глубоко истощены.",
				        "У вас почти нет еды и нет возможности подать сигнал.",
				        "Вам нужно решиться на отчаянный шаг, чтобы выжить.",
				        "Ваша единственная надежда — гнездо крупной хищной птицы на высокой скале (возможная еда или перья для сигнала)",
				        "или самодельный плот из обломков на берегу (риск выхода в открытое море).",
				        "Каков ваш отчаянный шаг?",
				        "Вариант A: Попытаться взобраться к птичьему гнезду. (Риск серьезной травмы ради ценной еды и материалов.)",
				        "Вариант B: Спустить на воду самодельный плот. (Риск столкновения со стихией ради шанса быть замеченным в море.)"
				    },
				    {
				        "Ви самотні, поранені та глибоко виснажені.",
				        "У вас майже немає їжі та немає можливості подати сигнал.",
				        "Вам потрібно зважитися на відчайдушний крок, щоб вижити.",
				        "Ваша єдина надія — гніздо великого хижого птаха на високій скелі (можлива їжа або пір'я для сигналу)",
				        "або саморобний пліт із уламків на березі (ризик виходу у відкрите море).",
				        "Яким буде ваш відчайдушний крок?",
				        "Варіант A: Спробувати піднятися до пташиного гнізда. (Ризик серйозної травми заради цінної їжі та матеріалів.)",
				        "Варіант B: Спустити на воду саморобний пліт. (Ризик зіткнення зі стихією заради шансу бути поміченим у морі.)"
				    }
				};

				//-3hp
				public static String[][] chapter3HardenedSurvivorAOutcome1 = {
				    {
				        "You reach the nest, but the protective parent bird attacks, causing you to fall.",
				        "The injury is severe.",
				        "The fall is too much for your weakened state."
				    },
				    {
				        "Вы добираетесь до гнезда, но взрослая птица атакует вас, защищая потомство, и вы падаете.",
				        "Травма очень серьезная.",
				        "Это падение стало роковым для вашего ослабленного организма."
				    },
				    {
				        "Ви дістаєтеся до гнізда, але дорослий птах атакує вас, захищаючи потомство, і ви падаєте.",
				        "Травма дуже серйозна.",
				        "Це падіння стало фатальним для вашого ослабленого організму."
				    }
				};

				//+1hp
				public static String[][] chapter3HardenedSurvivorAOutcome2 = {
				    {
				        "You successfully gather food and use feathers/twine to build a small kite/signal.",
				        "You are spotted days later."
				    },
				    {
				        "Вам удается добыть еду и использовать перья с веревкой, чтобы сделать небольшой воздушный змей для сигнала.",
				        "Через несколько дней вас замечают."
				    },
				    {
				        "Вам вдається добути їжу та використати пір'я з мотузкою, щоб зробити невеликий повітряний змій для сигналу.",
				        "Через кілька днів вас помічають."
				    }
				};

				//-3hp
				public static String[][] chapter3HardenedSurvivorBOutcome1 = {
				    {
				        "The raft is too weak.",
				        "It breaks apart in the first storm.",
				        "You drown quickly in the rough sea."
				    },
				    {
				        "Плот оказался слишком хлипким.",
				        "Он разваливается во время первого же шторма.",
				        "Вы быстро тонете в бушующем море."
				    },
				    {
				        "Пліт виявився занадто слабким.",
				        "Він розвалюється під час першого ж шторму.",
				        "Ви швидко тонете в бурхливому морі."
				    }
				};

				//-2hp
				public static String[][] chapter3HardenedSurvivorBOutcome2 = {
				    {
				        "You manage to drift long enough to be picked up by a fishing vessel.",
				        "You are rescued, but severe exposure leaves you with lasting chronic conditions."
				    },
				    {
				        "Вам удается продержаться на плаву достаточно долго, чтобы вас подобрало рыболовное судно.",
				        "Вы спасены, но длительное пребывание в открытом море приводит к тяжелым хроническим заболеваниям."
				    },
				    {
				        "Вам вдається протриматися на плаву достатньо довго, щоб вас підібрало рибальське судно.",
				        "Ви врятовані, але тривале перебування у відкритому морі призводить до важких хронічних захворювань."
				    }
				};
		}
		
		//Chapter 3 (follows the Lucky Break Ending)
		public static class Chapter3LuckyBreakData {
			public static char[][] chapter3LuckyBreakTitle = {
					("   Chapter 3: The Persistent Island").toUpperCase().toCharArray(),
					("     Глава 3: Неотступный остров").toUpperCase().toCharArray(),
					("    Розділ 3: Невідступний острів").toUpperCase().toCharArray()
			};
			public static String[][] chapter3LuckyBreak = {
				    {
				        "You were rescued, but the fractured leg is debilitating.",
				        "You are now being treated on the rescue vessel's small infirmary, but a fever has spiked, threatening the stability of the fracture.",
				        "The medic is inexperienced and offers you two options for immediate care:",
				        "a potent local anesthetic (risking heart failure due to unknown side effects)",
				        "or a large dose of broad-spectrum antibiotics (risking allergic reaction).",
				        "What treatment do you accept?",
				        "Choice A: Accept the local anesthetic. (High-risk, high-reward for pain relief/stability.)",
				        "Choice B: Accept the broad-spectrum antibiotics. (Lower immediate risk, but uncertain efficacy against the fever.)"
				    },
				    {
				        "Вас спасли, но перелом ноги лишает вас сил.",
				        "Вас лечат в небольшом лазарете спасательного судна, но резко поднялась температура, что угрожает стабильности перелома.",
				        "Медик неопытен и предлагает два варианта немедленной помощи:",
				        "сильное местное обезболивающее (риск остановки сердца из-за неизвестных побочных эффектов)",
				        "или большую дозу антибиотиков широкого спектра действия (риск аллергической реакции).",
				        "Какое лечение вы выберете?",
				        "Вариант A: Местное обезболивающее. (Высокий риск, но отличный шанс на снятие боли и стабилизацию.)",
				        "Вариант B: Антибиотики широкого спектра. (Меньший немедленный риск, но сомнительная эффективность против жара.)"
				    },
				    {
				        "Вас врятували, але перелом ноги позбавляє вас сил.",
				        "Вас лікують у невеликому лазареті рятувального судна, але різко піднялася температура, що загрожує стабільності перелому.",
				        "Медик недосвідчений і пропонує два варіанти негайної допомоги:",
				        "сильне місцеве знеболювальне (ризик зупинки серця через невідомі побічні ефекти)",
				        "або велику дозу антибіотиків широкого спектра дії (ризик алергічної реакції).",
				        "Яке лікування ви оберете?",
				        "Варіант A: Місцеве знеболювальне. (Високий ризик, але чудовий шанс на зняття болю та стабілізацію.)",
				        "Варіант B: Антибіотики широкого спектра. (Менший негайний ризик, але сумнівна ефективність проти жару.)"
				    }
				};

				//+2hp
				public static String[][] chapter3LuckyBreakAOutcome1 = {
				    {
				        "The anesthetic is successful, stabilizing the pain and the fever.",
				        "The recovery is long, but clean."
				    },
				    {
				        "Анестезия прошла успешно, боль утихла, а жар спал.",
				        "Восстановление будет долгим, но пройдет без осложнений."
				    },
				    {
				        "Анестезія пройшла успішно, біль ущух, а жар спав.",
				        "Відновлення буде тривалим, але пройде без ускладнень."
				    }
				};

				//-2hp
				public static String[][] chapter3LuckyBreakAOutcome2 = {
				    {
				        "The unknown anesthetic causes a massive internal shock, overwhelming your already weak body."
				    },
				    {
				        "Неизвестный препарат вызывает сильнейший внутренний шок, с которым ваше слабое тело не может справиться."
				    },
				    {
				        "Невідомий препарат викликає сильний внутрішній шок, з яким ваше слабке тіло не може впоратися."
				    }
				};

				//+1hp
				public static String[][] chapter3LuckyBreakBOutcome1 = {
				    {
				        "The antibiotics stabilize the fever.",
				        "The healing is slow but successful."
				    },
				    {
				        "Антибиотики сбивают жар.",
				        "Исцеление идет медленно, но успешно."
				    },
				    {
				        "Антибіотики збивають жар.",
				        "Зцілення йде повільно, але успішно."
				    }
				};

				//-2hp
				public static String[][] chapter3LuckyBreakBOutcome2 = {
				    {
				        "You suffer a severe allergic reaction, which the inexperienced medic cannot treat quickly enough."
				    },
				    {
				        "У вас начинается тяжелая аллергическая реакция, которую неопытный медик не может быстро купировать."
				    },
				    {
				        "У вас починається важка алергічна реакція, яку недосвідчений медик не може швидко купірувати."
				    }
				};
		}
		//Chapter 3 (follows the Prisoner Ending)
		public static class Chapter3PrisonerData {
			public static char[][] chapter3PrisonerTitle = {
					("   Chapter 3: The Persistent Island").toUpperCase().toCharArray(),
					("      Глава 3: Неотступный остров").toUpperCase().toCharArray(),
					("     Розділ 3: Невідступний острів").toUpperCase().toCharArray()
			};
			public static String[][] chapter3Prisoner = {
				    {
				        "You are held in a secure, but small, wooden cage near the tribe's main camp.",
				        "They feed you minimal food, and your strength is failing.",
				        "Your best chance for escape is when the guard rotation changes at dawn.",
				        "You have only two items you can manipulate:",
				        "a loose floorboard near your feet or a piece of jagged shell left in your meager food ration.",
				        "What is your immediate plan for escape?",
				        "Choice A: Use the jagged shell to slowly cut the rope bindings at night. (Prioritize stealth, risk being discovered cutting the ropes.)",
				        "Choice B: Attempt to pry the loose floorboard open just before dawn. (Prioritize direct escape, risk being caught by the guard change.)"
				    },
				    {
				        "Вас держат в надежной, но тесной деревянной клетке рядом с главным лагерем племени.",
				        "Вас кормят очень скудно, и силы покидают вас.",
				        "Ваш лучший шанс на побег — смена караула на рассвете.",
				        "У вас есть только два предмета, которыми можно воспользоваться:",
				        "расшатанная половица под ногами или осколок зазубренной ракушки, оставшийся в вашей скудной порции еды.",
				        "Каков ваш план побега?",
				        "Вариант A: Использовать ракушку, чтобы ночью медленно перерезать веревки. (Приоритет: скрытность, риск быть обнаруженным за делом.)",
				        "Вариант B: Попытаться выломать половицу прямо перед рассветом. (Приоритет: прямой побег, риск попасться во время смены караула.)"
				    },
				    {
				        "Вас тримають у надійній, але тісній дерев'яній клітці поруч із головним табором племені.",
				        "Вас годують дуже скудно, і сили покидають вас.",
				        "Ваш найкращий шанс на втечу — зміна варти на світанку.",
				        "У вас є лише два предмети, якими можна скористатися:",
				        "розхитана мостини під ногами або осколок зазубреної мушлі, що залишився у вашій мізерній порції їжі.",
				        "Який ваш план втечі?",
				        "Варіант A: Використати мушлю, щоб вночі повільно перерізати мотузки. (Пріоритет: скритність, ризик бути викритим за справою.)",
				        "Варіант B: Спробувати виламати мостину прямо перед світанком. (Пріоритет: пряма втеча, ризик попастися під час зміни варти.)"
				    }
				};

				//-3hp
				public static String[][] chapter3PrisonerAOutcome1 = {
				    {
				        "You cut the ropes but are discovered by the dawn guard during the final moments.",
				        "You are caught and executed to maintain the tribe's secret."
				    },
				    {
				        "Вы перерезали веревки, но в последний момент вас обнаружил рассветный страж.",
				        "Вас ловят и казнят, чтобы сохранить тайну племени."
				    },
				    {
				        "Ви перерізали мотузки, але в останній момент вас виявив світанковий вартовий.",
				        "Вас ловлять і страчують, щоб зберегти таємницю племені."
				    }
				};

				//+1hp
				public static String[][] chapter3PrisonerAOutcome2 = {
				    {
				        "You escape the ropes.",
				        "You manage to sneak away under the cover of the morning fog and are later found by a naval patrol."
				    },
				    {
				        "Вы освобождаетесь от веревок.",
				        "Вам удается ускользнуть под прикрытием утреннего тумана, и позже вас находит морской патруль."
				    },
				    {
				        "Ви звільняєтеся від мотузок.",
				        "Вам вдається вислизнути під прикриттям ранкового туману, і пізніше вас знаходить морський патруль."
				    }
				};

				//-2hp
				public static String[][] chapter3PrisonerBOutcome1 = {
				    {
				        "The floorboard creaks loudly, alerting the guard.",
				        "They subdue you, severely beating you for the attempted escape",
				        "You remain a prisoner indefinitely."
				    },
				    {
				        "Половица громко скрипит, привлекая внимание стражи.",
				        "Вас скручивают и жестоко избивают за попытку побега.",
				        "Вы остаетесь пленником на неопределенный срок."
				    },
				    {
				        "Мостина гучно скрипить, привертаючи увагу варти.",
				        "Вас скручують і жорстоко б'ють за спробу втечі.",
				        "Ви залишаєтеся полоненим на невизначений термін."
				    }
				};

				//+0hp
				public static String[][] chapter3PrisonerBOutcome2 = {
				    {
				        "You successfully pry the board loose and slip out just as the guards rotate.",
				        "You hide in the jungle and are eventually found by a search party looking for the downed Aegis."
				    },
				    {
				        "Вы успешно выламываете доску и выбираетесь наружу как раз во время смены караула.",
				        "Вы прячетесь в джунглях, и в конце концов вас находит поисковый отряд, разыскивающий затонувшую «Эгиду»."
				    },
				    {
				        "Ви успішно виламуєте дошку і вибираєтеся назовні саме під час зміни варти.",
				        "Ви ховаєтеся в джунглях, і зрештою вас знаходить пошуковий загін, що розшукує затонулу «Егіду»."
				    }
				};
			
		}
		//Chapter 3 (follows the Sentinel Ending)
		public static class Chapter3SentinelData {
			public static char[][] chapter3SentinelTitle = {
					("   Chapter 3: The Persistent Island").toUpperCase().toCharArray(),
					("     Глава 3: Неотступный остров").toUpperCase().toCharArray(),
					("     Розділ 3: Невідступний острів").toUpperCase().toCharArray()
			};
			public static String[][] chapter3Sentinel = {
				    {
				        "You are stranded again on a remote island, injured, but you successfully saved the mission's Strongbox (valuable cargo).",
				        "You must now protect it.",
				        "You realize the island you landed on has military relics (rusted weapons) scattered around,",
				        "or you could bury the strongbox and immediately focus on shelter and signaling.",
				        "What is your immediate priority?",
				        "Choice A: Scavenge the military relics for a makeshift weapon. (Prioritize defense, risk infection/injury from rusted metal.)",
				        "Choice B: Bury the strongbox deep and focus on signaling. (Prioritize recovery and escape, risk losing the cargo.)"
				    },
				    {
				        "Вы снова оказались на необитаемом острове, ранены, но вам удалось спасти сейф с ценным грузом.",
				        "Теперь вы должны защитить его.",
				        "Вы замечаете, что на острове разбросаны военные реликвии (ржавое оружие),",
				        "или же вы можете закопать сейф и немедленно заняться укрытием и подачей сигналов.",
				        "Что станет вашим приоритетом?",
				        "Вариант A: Обыскать военные реликвии в поисках самодельного оружия. (Приоритет: защита, риск инфекции от ржавого металла.)",
				        "Вариант B: Глубоко закопать сейф и сосредоточиться на сигналах. (Приоритет: спасение, риск потери груза.)"
				    },
				    {
				        "Ви знову опинилися на безлюдному острові, поранені, але вам вдалося врятувати сейф із цінним вантажем.",
				        "Тепер ви мусите захистити його.",
				        "Ви помічаєте, що на острові розкидані військові реліквії (іржава зброя),",
				        "або ж ви можете закопати сейф і негайно зосередитися на укритті та подачі сигналів.",
				        "Що стане вашим пріоритетом?",
				        "Варіант A: Обшукати військові реліквії в пошуках саморобної зброї. (Пріоритет: захист, ризик інфекції від іржавого металу.)",
				        "Варіант B: Глибоко закопати сейф і зосередитися на сигналах. (Пріоритет: порятунок, ризик втрати вантажу.)"
				    }
				};

				//-3hp
				public static String[][] chapter3SentinelAOutcome1 = {
				    {
				        "You find a functional knife but sustain a severe cut from the rusted metal, leading to immediate infection.",
				        "The infection spreads rapidly, and without antibiotics, your body fails."
				    },
				    {
				        "Вы находите пригодный нож, но сильно режетесь о ржавый металл, что приводит к мгновенному заражению.",
				        "Инфекция быстро распространяется, и без антибиотиков ваш организм не справляется."
				    },
				    {
				        "Ви знаходите придатний ніж, але сильно ріжетеся об іржавий метал, що призводить до миттєвого зараження.",
				        "Інфекція швидко поширюється, і без антибіотиків ваш організм не справляється."
				    }
				};

				//+1hp
				public static String[][] chapter3SentinelAOutcome2 = {
				    {
				        "You find and clean a usable machete.",
				        "You use the tools to build a fortified position and guard the strongbox until a passing freighter spots you."
				    },
				    {
				        "Вы находите и очищаете пригодное мачете.",
				        "С помощью инструментов вы строите укрепленную позицию и охраняете сейф, пока вас не замечает проходящий сухогруз."
				    },
				    {
				        "Ви знаходите та очищаєте придатне мачете.",
				        "За допомогою інструментів ви будуєте укріплену позицію і охороняєте сейф, поки вас не помічає прохідний суховантаж."
				    }
				};

				//-1hp
				public static String[][] chapter3SentinelBOutcome1 = {
				    {
				        "You bury the strongbox successfully, but the heavy exertion aggravates your previous shoulder injury.",
				        "You manage to signal, but the cargo is compromised by the weather."
				    },
				    {
				        "Вы успешно закапываете сейф, но тяжелая нагрузка усугубляет вашу старую травму плеча.",
				        "Вам удается подать сигнал, но груз портится из-за погодных условий."
				    },
				    {
				        "Ви успішно закопуєте сейф, але важке навантаження погіршує вашу стару травму плеча.",
				        "Вам вдається подати сигнал, але вантаж псується через погодні умови."
				    }
				};

				//-2hp
				public static String[][] chapter3SentinelBOutcome2 = {
				    {
				        "You bury the strongbox, but heavy rains wash away your markings.",
				        "You signal successfully, but the cargo is lost forever."
				    },
				    {
				        "Вы закапываете сейф, но проливные дожди смывают ваши метки.",
				        "Вы успешно подаете сигнал, но груз потерян навсегда."
				    },
				    {
				        "Ви закопуєте сейф, але зливи змивають ваші позначки.",
				        "Ви успішно подаєте сигнал, але вантаж втрачено назавжди."
				    }
				};
			
			}
		
		//Contains random events for normal difficulty
		   public static class RandomEventsNormal {
			   //-1hp
			   public static String[][] normalChapter1 = {
					    {
					        "You misjudge a step on some wet sand, wrenching your ankle slightly.",
					        "It's not debilitating, but you'll limp for a while."
					    },
					    {
					        "Вы оступились на мокром песке, слегка подвернув лодыжку.",
					        "Это не лишает вас возможности идти, но какое-то время вы будете хромать."
					    },
					    {
					        "Ви оступилися на мокрому піску, злегка підвернувши кісточку.",
					        "Це не позбавляє вас можливості йти, але деякий час ви будете кульгати."
					    }
					};

					//-1hp
					public static String[][] normalChapter11 = {
					    {
					        "You step directly into a large ground burrow of aggressive, poisonous ants.",
					        "You panic and scramble away, but they cover your legs before you can brush them off, requiring immediate, frantic cleaning"
					    },
					    {
					        "Вы наступаете прямо в большую нору агрессивных ядовитых муравьев.",
					        "В панике вы отбегаете в сторону, но они успевают облепить ваши ноги, требуя немедленной и судорожной очистки."
					    },
					    {
					        "Ви наступаєте прямо у велику нору агресивних отруйних мурах.",
					        "У паніці ви відбігаєте вбік, але вони встигають облепити ваші ноги, вимагаючи негайного і судомного очищення."
					    }
					};

					//-1hp
					public static String[][] normalChapter2 = {
					    {
					        "The intense heat and humidity cause a bout of lightheadedness.",
					        "You must pause for several minutes to recover, losing critical time."
					    },
					    {
					        "Сильная жара и влажность вызывают приступ головокружения.",
					        "Вам приходится остановиться на несколько минут, чтобы прийти в себя, теряя драгоценное время."
					    },
					    {
					        "Сильна спека та вологість викликають напад запаморочення.",
					        "Вам доводиться зупинитися на кілька хвилин, щоб опритомніти, втрачаючи дорогоцінний час."
					    }
					};

					//-2hp
					public static String[][] normalChapter22 = {
					    {
					        "You accidentally kick a hidden wasp nest.",
					        "You run, but the insects chase you for some time, leaving several painful, stinging bites."
					    },
					    {
					        "Вы случайно задели ногой скрытое осиное гнездо.",
					        "Вы бросаетесь бежать, но насекомые преследуют вас какое-то время, оставляя несколько болезненных жалящих укусов."
					    },
					    {
					        "Ви випадково зачепили ногою приховане осине гніздо.",
					        "Ви кидаєтеся бігти, але комахи переслідують вас деякий час, залишаючи кілька болючих жалючих укусів."
					    }
					};

					//-2hp
					public static String[][] normalChapter3 = {
					    {
					        "You are momentarily startled by a large, harmless lizard darting across your path.",
					        "In the shock, you drop your canteen, and a quarter of your remaining water spills out."
					    },
					    {
					        "Вас пугает крупная, но безобидная ящерица, перебежавшая вам путь.",
					        "От неожиданности вы роняете флягу, и четверть оставшейся воды выливается."
					    },
					    {
					        "Вас лякає велика, але нешкідлива ящірка, що перебігла вам шлях.",
					        "Від несподіванки ви впускаєте флягу, і чверть води, що залишилася, виливається."
					    }
					};

		  }
		 //Contains random events for hard difficulty
		   public static class RandomEventsHard {
			 //-2hp
			   public static String[][] hardChapter1 = {
			       {
			           "You attempt to cross a shallow stream, but the current is unexpectedly strong.",
			           "You fall and are briefly submerged, exhausting you and soaking your remaining supplies."
			       },
			       {
			           "Вы пытаетесь пересечь мелководный ручей, но течение оказывается неожиданно сильным.",
			           "Вы падаете и на мгновение уходите под воду; это изматывает вас и пропитывает водой оставшиеся припасы."
			       },
			       {
			           "Ви намагаєтеся перетнути мілководний струмок, але течія виявляється несподівано сильною.",
			           "Ви падаєте і на мить опиняєтеся під водою; це виснажує вас і просочує водою залишки ваших припасів."
			       }
			   };

			   //-2hp
			   public static String[][] hardChapter11 = {
			       {
			           "You encounter a sudden, localized cloud of highly irritating pollen/spores released from an exotic plant.",
			           "You inhale a significant amount."
			       },
			       {
			           "Вы попадаете в облако раздражающей пыльцы, выброшенной экзотическим растением.",
			           "Вы вдыхаете значительное её количество."
			       },
			       {
			           "Ви потрапляєте в хмару подразнювального пилку, випущеного екзотичною рослиною.",
			           "Ви вдихаєте значну його кількість."
			       }
			   };

			   //-1hp
			   public static String[][] hardChapter2 = {
			       {
			           "You spend time attempting to hunt/forage for immediate food.",
			           "but the effort is fruitless, resulting in wasted energy and heightened hunger."
			       },
			       {
			           "Вы тратите время, пытаясь добыть еду охотой или собирательством,",
			           "но усилия тщетны, что приводит к потере энергии и усилению голода."
			       },
			       {
			           "Ви витрачаєте час, намагаючись добути їжу полюванням або збиральництвом,",
			           "але зусилля марні, що призводить до втрати енергії та посилення голоду."
			       }
			   };

			   //-2hp
			   public static String[][] hardChapter22 = {
			       {
			           "You accidentally disturb a hidden nest or burrow of small, highly agitated animals (e.g., wasps, poisonous ants)",
			           "but couldn't react instantly to avoid being swarmed."
			       },
			       {
			           "Вы случайно потревожили скрытое гнездо или нору мелких агрессивных существ (например, ос или ядовитых муравьев),",
			           "и не успели вовремя среагировать, прежде чем они облепили вас."
			       },
			       {
			           "Ви випадково потурбували приховане гніздо або нору дрібних агресивних істот (наприклад, ос або отруйних мурах),",
			           "і не встигли вчасно зреагувати, перш ніж вони облепили вас."
			       }
			   };

			   //-1hp
			   public static String[][] hardChapter3 = {
			       {
			           "You disturb a small ant pile.",
			           "You stomp them out quickly, but a few manage to bite, leaving itchy welts."
			       },
			       {
			           "Вы потревожили небольшой муравейник.",
			           "Вы быстро их стряхиваете, но несколько успевают укусить, оставляя зудящие волдыри."
			       },
			       {
			           "Ви потурбували невеликий мурашник.",
			           "Ви швидко їх струшуєте, але кілька встигають вкусити, залишаючи сверблячі пухирі."
			       }
			   };
		   }
		   
		 //Contains random events for extreme difficulty
		   public static class RandomEventsExtreme {
			 //-1hp
			   public static String[][] extremeChapter1 = {
			       {
			           "You slip on the log, but you catch yourself immediately.",
			           "You strained your wrist slightly."
			       },
			       {
			           "Вы поскользнулись на бревне, но успели сразу же удержаться.",
			           "Вы слегка растянули запястье."
			       },
			       {
			           "Ви послизнулися на колоді, але встигли одразу ж втриматися.",
			           "Ви злегка розтягнули зап'ястя."
			       }
			   };

			   //-3hp
			   public static String[][] extremeChapter11 = {
			       {
			           "A sudden, torrential downpour turns the ground to slippery mud.",
			           "You fall down a short embankment, hitting your head and temporarily stunning yourself."
			       },
			       {
			           "Внезапный проливной дождь превращает землю в скользкую грязь.",
			           "Вы скатываетесь с небольшого склона, ударяетесь головой и на время теряете ориентацию."
			       },
			       {
			           "Раптовий проливний дощ перетворює землю на слизьку багнюку.",
			           "Ви скочуєтеся з невеликого схилу, вдаряєтеся головою і на деякий час втрачаєте орієнтацію."
			       }
			   };

			   //-3hp
			   public static String[][] extremeChapter2 = {
			       {
			           "You inadvertently disturb a small pocket of volcanic steam.",
			           "The brief, intense heat singes your exposed skin badly, causing painful surface burns."
			       },
			       {
			           "Вы случайно потревожили небольшое скопление вулканического пара.",
			           "Кратковременный, но интенсивный жар сильно опаляет вашу кожу, вызывая болезненные поверхностные ожоги."
			       },
			       {
			           "Ви випадково потурбували невелике скупчення вулканічної пари.",
			           "Короткочасний, але інтенсивний жар сильно обпікає вашу шкіру, викликаючи болючі поверхневі опіки."
			       }
			   };

			   //-2hp
			   public static String[][] extremeChapter22 = {
			       {
			           "You slip badly on the log and plunge into the shallow river below.",
			           "You hit your knee on a rock and struggle against the small current to get back up"
			       },
			       {
			           "Вы сильно поскальзываетесь на бревне и падаете в неглубокую реку.",
			           "Вы ударяетесь коленом о камень и с трудом боретесь с небольшим течением, чтобы подняться."
			       },
			       {
			           "Ви сильно послизнулися на колоді та впали в неглибоку річку.",
			           "Ви вдарилися коліном об камінь і насилу боретеся з невеликою течією, щоб піднятися."
			       }
			   };

			   //-3hp
			   public static String[][] extremeChapter3 = {
			       {
			           "While moving through the dense interior, you encounter a pack of aggressive, wild canines.",
			           "You fight them off with great difficulty, sustaining deep, painful bites and exhausting your reserves."
			       },
			       {
			           "Продвигаясь сквозь густые заросли, вы сталкиваетесь со стаей агрессивных диких псов.",
			           "С огромным трудом вам удается отбиться от них, получив глубокие болезненные укусы и полностью истощив свои силы."
			       },
			       {
			           "Просуваючись крізь густі хащі, ви стикаєтеся зі зграєю агресивних диких псів.",
			           "З величезними труднощами вам вдається відбитися від них, отримавши глибокі болючі укуси та повністю виснаживши свої сили."
			       }
			   };
		   }
		
		
}

		
			
			
			
			
		

		
	
		
		
	


