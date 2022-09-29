package com.stockapp.util


object Sample {

    val jsonPortfolioEmpty = "{\n" +
            "    \"stocks\": []\n" +
            "}"

    val jsonPortfolio = "{\n" +
            "    \"stocks\": [\n" +
            "        {\n" +
            "            \"ticker\": \"TWTR\",\n" +
            "            \"name\": \"Twitter, Inc.\",\n" +
            "            \"currency\": \"USD\",\n" +
            "            \"current_price_cents\": 3833,\n" +
            "            \"quantity\": null,\n" +
            "            \"current_price_timestamp\": 1636657688\n" +
            "        },\n" +
            "        {\n" +
            "            \"ticker\": \"^GSPC\",\n" +
            "            \"name\": \"S&P 500\",\n" +
            "            \"currency\": \"USD\",\n" +
            "            \"current_price_cents\": 318157,\n" +
            "            \"quantity\": 25,\n" +
            "            \"current_price_timestamp\": 1636657688\n" +
            "        },\n" +
            "        {\n" +
            "            \"ticker\": \"RUNINC\",\n" +
            "            \"name\": \"Runners Inc.\",\n" +
            "            \"currency\": \"USD\",\n" +
            "            \"current_price_cents\": 3614,\n" +
            "            \"quantity\": 5,\n" +
            "            \"current_price_timestamp\": 1636657688\n" +
            "        },\n" +
            "        {\n" +
            "            \"ticker\": \"BAC\",\n" +
            "            \"name\": \"Bank of America Corporation\",\n" +
            "            \"currency\": \"USD\",\n" +
            "            \"current_price_cents\": 2393,\n" +
            "            \"quantity\": 10,\n" +
            "            \"current_price_timestamp\": 1636657688\n" +
            "        },\n" +
            "        {\n" +
            "            \"ticker\": \"EXPE\",\n" +
            "            \"name\": \"Expedia Group, Inc.\",\n" +
            "            \"currency\": \"USD\",\n" +
            "            \"current_price_cents\": 8165,\n" +
            "            \"quantity\": null,\n" +
            "            \"current_price_timestamp\": 1636657688\n" +
            "        },\n" +
            "        {\n" +
            "            \"ticker\": \"GRUB\",\n" +
            "            \"name\": \"Grubhub Inc.\",\n" +
            "            \"currency\": \"USD\",\n" +
            "            \"current_price_cents\": 6975,\n" +
            "            \"quantity\": null,\n" +
            "            \"current_price_timestamp\": 1636657688\n" +
            "        },\n" +
            "        {\n" +
            "            \"ticker\": \"TRUNK\",\n" +
            "            \"name\": \"Trunk Club\",\n" +
            "            \"currency\": \"USD\",\n" +
            "            \"current_price_cents\": 17632,\n" +
            "            \"quantity\": 9,\n" +
            "            \"current_price_timestamp\": 1636657688\n" +
            "        },\n" +
            "        {\n" +
            "            \"ticker\": \"FIT\",\n" +
            "            \"name\": \"Fitbit, Inc.\",\n" +
            "            \"currency\": \"USD\",\n" +
            "            \"current_price_cents\": 678,\n" +
            "            \"quantity\": 2,\n" +
            "            \"current_price_timestamp\": 1636657688\n" +
            "        },\n" +
            "        {\n" +
            "            \"ticker\": \"UA\",\n" +
            "            \"name\": \"Under Armour, Inc.\",\n" +
            "            \"currency\": \"USD\",\n" +
            "            \"current_price_cents\": 844,\n" +
            "            \"quantity\": 7,\n" +
            "            \"current_price_timestamp\": 1636657688\n" +
            "        },\n" +
            "        {\n" +
            "            \"ticker\": \"VTI\",\n" +
            "            \"name\": \"Vanguard Total Stock Market Index Fund ETF Shares\",\n" +
            "            \"currency\": \"USD\",\n" +
            "            \"current_price_cents\": 15994,\n" +
            "            \"quantity\": null,\n" +
            "            \"current_price_timestamp\": 1636657688\n" +
            "        },\n" +
            "        {\n" +
            "            \"ticker\": \"RUN\",\n" +
            "            \"name\": \"Run\",\n" +
            "            \"currency\": \"USD\",\n" +
            "            \"current_price_cents\": 6720,\n" +
            "            \"quantity\": 12,\n" +
            "            \"current_price_timestamp\": 1636657688\n" +
            "        },\n" +
            "        {\n" +
            "            \"ticker\": \"VWO\",\n" +
            "            \"name\": \"Vanguard FTSE Emerging Markets\",\n" +
            "            \"currency\": \"USD\",\n" +
            "            \"current_price_cents\": 4283,\n" +
            "            \"quantity\": null,\n" +
            "            \"current_price_timestamp\": 1636657688\n" +
            "        },\n" +
            "        {\n" +
            "            \"ticker\": \"JNJ\",\n" +
            "            \"name\": \"Johnson & Johnson\",\n" +
            "            \"currency\": \"USD\",\n" +
            "            \"current_price_cents\": 14740,\n" +
            "            \"quantity\": null,\n" +
            "            \"current_price_timestamp\": 1636657688\n" +
            "        },\n" +
            "        {\n" +
            "            \"ticker\": \"BRKA\",\n" +
            "            \"name\": \"Berkshire Hathaway Inc.\",\n" +
            "            \"currency\": \"USD\",\n" +
            "            \"current_price_cents\": 28100000,\n" +
            "            \"quantity\": 1,\n" +
            "            \"current_price_timestamp\": 1636657688\n" +
            "        },\n" +
            "        {\n" +
            "            \"ticker\": \"^DJI\",\n" +
            "            \"name\": \"Dow Jones Industrial Average\",\n" +
            "            \"currency\": \"USD\",\n" +
            "            \"current_price_cents\": 2648154,\n" +
            "            \"quantity\": null,\n" +
            "            \"current_price_timestamp\": 1636657688\n" +
            "        },\n" +
            "        {\n" +
            "            \"ticker\": \"^TNX\",\n" +
            "            \"name\": \"Treasury Yield 10 Years\",\n" +
            "            \"currency\": \"USD\",\n" +
            "            \"current_price_cents\": 61,\n" +
            "            \"quantity\": 10,\n" +
            "            \"current_price_timestamp\": 1636657688\n" +
            "        },\n" +
            "        {\n" +
            "            \"ticker\": \"RUNWAY\",\n" +
            "            \"name\": \"Rent The Runway\",\n" +
            "            \"currency\": \"USD\",\n" +
            "            \"current_price_cents\": 24819,\n" +
            "            \"quantity\": null,\n" +
            "            \"current_price_timestamp\": 1636657688\n" +
            "        }\n" +
            "    ]\n" +
            "}"
}