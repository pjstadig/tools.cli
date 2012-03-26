{:namespaces
 ({:source-url
   "https://github.com/clojure/tools.cli/blob/ec7bdb3b1189db0dfcd7b1c0d92e784eef84f926/src/main/clojure/clojure/tools/cli.clj",
   :wiki-url
   "http://clojure.github.com/tools.cli/clojure.tools.cli-api.html",
   :name "clojure.tools.cli",
   :author "Gareth Jones",
   :doc nil}),
 :vars
 ({:arglists ([args & specs]),
   :name "cli",
   :namespace "clojure.tools.cli",
   :source-url
   "https://github.com/clojure/tools.cli/blob/ec7bdb3b1189db0dfcd7b1c0d92e784eef84f926/src/main/clojure/clojure/tools/cli.clj#L108",
   :raw-source-url
   "https://github.com/clojure/tools.cli/raw/ec7bdb3b1189db0dfcd7b1c0d92e784eef84f926/src/main/clojure/clojure/tools/cli.clj",
   :wiki-url
   "http://clojure.github.com/tools.cli//clojure.tools.cli-api.html#clojure.tools.cli/cli",
   :doc
   "Parse the provided args using the given specs. Specs are vectors\ndescribing a command line argument. For example:\n\n[\"-p\" \"--port\" \"Port to listen on\" :default 3000 :parse-fn #(Integer/parseInt %)]\n\nFirst provide the switches (from least to most specific), then a doc\nstring, and pairs of options.\n\nValid options are :default, :parse-fn, and :flag. See\nhttps://github.com/clojure/tools.cli/blob/master/README.md for more\ndetailed examples.\n\nReturns a vector containing a map of the parsed arguments, a vector\nof extra arguments that did not match known switches, and a\ndocumentation banner to provide usage instructions.",
   :var-type "function",
   :line 108,
   :file "src/main/clojure/clojure/tools/cli.clj"})}