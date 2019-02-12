define(["ace/lib/oop", "ace/mode/text", "ace/mode/text_highlight_rules"], function(oop, mText, mTextHighlightRules) {
	var HighlightRules = function() {
		var keywords = "Application|Attribute|BasicType|CHAR|CommandEvent|Consumer|DELETE|DataTransferObject|DomainEvent|DomainObjectOperation|Entity|Enum|EnumConstructorParameter|EnumValue|GET|INTEGER|Inheritance|JOINED|Module|POST|PUT|Parameter|Publish|Reference|Repository|RepositoryOperation|Resource|ResourceOperation|SINGLE_TABLE|STRING|Service|ServiceOperation|Subscribe|Trait|UNDEFINED|ValueObject|abstract|accessObjectName|aggregateRoot|attributes|auditable|basePackage|belongsToAggregate|cache|cascade|changeable|channel|collectionType|consumers|databaseColumn|databaseJoinColumn|databaseJoinTable|databaseTable|databaseType|delegate|delegateToAccessObject|discriminatorColumnLength|discriminatorColumnName|discriminatorColumnValue|discriminatorType|doc|domainObjectType|domainObjects|eventBus|eventType|extends|extendsName|external|false|fetch|gapClass|hint|httpMethod|immutable|index|inheritance|inverse|length|localInterface|many|mapKeyDomainObjectType|mapKeyType|messageRoot|modules|naturalKey|nullable|operations|opposite|optimisticLocking|orderBy|ordinal|otherDependencies|package|parameters|path|persistenceUnit|persistent|publish|references|remoteInterface|repository|repositoryDependencies|required|resources|returnString|serviceDelegate|serviceDependencies|services|subscribe|throws|to|topic|traits|transient|true|type|validate|value|values|visibility|webService";
		this.$rules = {
			"start": [
				{token: "comment", regex: "\\/\\/.*$"},
				{token: "comment", regex: "\\/\\*", next : "comment"},
				{token: "string", regex: '["](?:(?:\\\\.)|(?:[^"\\\\]))*?["]'},
				{token: "string", regex: "['](?:(?:\\\\.)|(?:[^'\\\\]))*?[']"},
				{token: "constant.numeric", regex: "[+-]?\\d+(?:(?:\\.\\d*)?(?:[eE][+-]?\\d+)?)?\\b"},
				{token: "lparen", regex: "[({]"},
				{token: "rparen", regex: "[)}]"},
				{token: "keyword", regex: "\\b(?:" + keywords + ")\\b"}
			],
			"comment": [
				{token: "comment", regex: ".*?\\*\\/", next : "start"},
				{token: "comment", regex: ".+"}
			]
		};
	};
	oop.inherits(HighlightRules, mTextHighlightRules.TextHighlightRules);
	
	var Mode = function() {
		this.HighlightRules = HighlightRules;
	};
	oop.inherits(Mode, mText.Mode);
	Mode.prototype.$id = "xtext/ddd";
	Mode.prototype.getCompletions = function(state, session, pos, prefix) {
		return [];
	}
	
	return {
		Mode: Mode
	};
});
