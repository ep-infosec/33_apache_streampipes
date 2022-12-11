
/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.apache.streampipes.vocabulary;


import java.util.Arrays;
import java.util.List;

public class SO {

  public static final String NS = "http://schema.org/";
  public static final String NS_PREFIX = "so";

  public static final String GeoJsonLineString = "http://streampipes.org/GeoJsonLineString";
  public static final String GeoJsonPolygon = "http://streampipes.org/GeoJsonPolygon";
  public static final String GeoJsonMultiPoint = "http://streampipes.org/GeoJsonMultiPoint";
  public static final String GeoJsonMultiLineString = "http://streampipes.org/GeoJsonMultiLineString";
  public static final String GeoJsonMultiPolygon = "http://streampipes.org/GeoJsonMultiPolygon";
  public static final String QuantitativeValue = "http://schema.org/QuantitativeValue";
  public static final String PropertyValueSpecification = "http://schema.org/PropertyValueSpecification";
  public static final String Number = "http://schema.org/Number";
  public static final String Enumeration = "http://schema.org/Enumeration";
  public static final String Altitude = "http://streampipes.org/Altitude";
  public static final String AcceptsReservations = "http://schema.org/acceptsReservations";
  public static final String AccessCode = "http://schema.org/accessCode";
  public static final String AccessibilityAPI = "http://schema.org/accessibilityAPI";
  public static final String AccessibilityControl = "http://schema.org/accessibilityControl";
  public static final String AccessibilityFeature = "http://schema.org/accessibilityFeature";
  public static final String AccessibilityHazard = "http://schema.org/accessibilityHazard";
  public static final String Action = "http://schema.org/action";
  public static final String ActiveIngredient = "http://schema.org/activeIngredient";
  public static final String ActivityDuration = "http://schema.org/activityDuration";
  public static final String ActivityFrequency = "http://schema.org/activityFrequency";
  public static final String AdditionalName = "http://schema.org/additionalName";
  public static final String AdditionalProperty = "http://schema.org/additionalProperty";
  public static final String AdditionalVariable = "http://schema.org/additionalVariable";
  public static final String AddressLocality = "http://schema.org/addressLocality";
  public static final String AddressRegion = "http://schema.org/addressRegion";
  public static final String AdministrationRoute = "http://schema.org/administrationRoute";
  public static final String AlcoholWarning = "http://schema.org/alcoholWarning";
  public static final String Algorithm = "http://schema.org/algorithm";
  public static final String AlignmentType = "http://schema.org/alignmentType";
  public static final String AlternateName = "http://schema.org/alternateName";
  public static final String AlternativeHeadline = "http://schema.org/alternativeHeadline";
  public static final String AmountOfThisGood = "http://schema.org/amountOfThisGood";
  public static final String AnswerCount = "http://schema.org/answerCount";
  public static final String ApplicationCategory = "http://schema.org/applicationCategory";
  public static final String ApplicationSubCategory = "http://schema.org/applicationSubCategory";
  public static final String ApplicationSuite = "http://schema.org/applicationSuite";
  public static final String ArrivalGate = "http://schema.org/arrivalGate";
  public static final String ArrivalPlatform = "http://schema.org/arrivalPlatform";
  public static final String ArrivalTerminal = "http://schema.org/arrivalTerminal";
  public static final String ArrivalTime = "http://schema.org/arrivalTime";
  public static final String ArticleBody = "http://schema.org/articleBody";
  public static final String ArticleSection = "http://schema.org/articleSection";
  public static final String Aspect = "http://schema.org/aspect";
  public static final String Assembly = "http://schema.org/assembly";
  public static final String AssemblyVersion = "http://schema.org/assemblyVersion";
  public static final String AssociatedPathophysiology = "http://schema.org/associatedPathophysiology";
  public static final String AudienceType = "http://schema.org/audienceType";
  public static final String AvailabilityEnds = "http://schema.org/availabilityEnds";
  public static final String AvailabilityStarts = "http://schema.org/availabilityStarts";
  public static final String AvailableFrom = "http://schema.org/availableFrom";
  public static final String AvailableThrough = "http://schema.org/availableThrough";
  public static final String Award = "http://schema.org/award";
  public static final String Background = "http://schema.org/background";
  public static final String BaseSalary = "http://schema.org/baseSalary";
  public static final String Benefits = "http://schema.org/benefits";
  public static final String BestRating = "http://schema.org/bestRating";
  public static final String BillingIncrement = "http://schema.org/billingIncrement";
  public static final String BiomechnicalClass = "http://schema.org/biomechnicalClass";
  public static final String BirthDate = "http://schema.org/birthDate";
  public static final String Bitrate = "http://schema.org/bitrate";
  public static final String BoardingGroup = "http://schema.org/boardingGroup";
  public static final String BodyLocation = "http://schema.org/bodyLocation";
  public static final String BookEdition = "http://schema.org/bookEdition";
  public static final String BookingTime = "http://schema.org/bookingTime";
  public static final String Boolean = "http://schema.org/Boolean";
  public static final String Box = "http://schema.org/box";
  public static final String Breadcrumb = "http://schema.org/breadcrumb";
  public static final String BreastfeedingWarning = "http://schema.org/breastfeedingWarning";
  public static final String BrowserRequirements = "http://schema.org/browserRequirements";
  public static final String BusName = "http://schema.org/busName";
  public static final String BusNumber = "http://schema.org/busNumber";
  public static final String Calories = "http://schema.org/calories";
  public static final String Caption = "http://schema.org/caption";
  public static final String CarbohydrateContent = "http://schema.org/carbohydrateContent";
  public static final String CarrierRequirements = "http://schema.org/carrierRequirements";
  public static final String CharacterName = "http://schema.org/characterName";
  public static final String CheckinTime = "http://schema.org/checkinTime";
  public static final String CheckoutTime = "http://schema.org/checkoutTime";
  public static final String ChildMaxAge = "http://schema.org/childMaxAge";
  public static final String ChildMinAge = "http://schema.org/childMinAge";
  public static final String CholesterolContent = "http://schema.org/cholesterolContent";
  public static final String Circle = "http://schema.org/circle";
  public static final String ClincalPharmacology = "http://schema.org/clincalPharmacology";
  public static final String ClipNumber = "http://schema.org/clipNumber";
  public static final String Closes = "http://schema.org/closes";
  public static final String CodeRepository = "http://schema.org/codeRepository";
  public static final String CodeValue = "http://schema.org/codeValue";
  public static final String CodingSystem = "http://schema.org/codingSystem";
  public static final String Color = "http://schema.org/color";
  public static final String CommentCount = "http://schema.org/commentCount";
  public static final String CommentText = "http://schema.org/commentText";
  public static final String CommentTime = "http://schema.org/commentTime";
  public static final String ConfirmationNumber = "http://schema.org/confirmationNumber";
  public static final String ContactType = "http://schema.org/contactType";
  public static final String ContentRating = "http://schema.org/contentRating";
  public static final String ContentSize = "http://schema.org/contentSize";
  public static final String ContentType = "http://schema.org/contentType";
  public static final String ContentUrl = "http://schema.org/contentUrl";
  public static final String CookTime = "http://schema.org/cookTime";
  public static final String CookingMethod = "http://schema.org/cookingMethod";
  public static final String CopyrightYear = "http://schema.org/copyrightYear";
  public static final String CostCurrency = "http://schema.org/costCurrency";
  public static final String CostOrigin = "http://schema.org/costOrigin";
  public static final String CostPerUnit = "http://schema.org/costPerUnit";
  public static final String CountriesNotSupported = "http://schema.org/countriesNotSupported";
  public static final String CountriesSupported = "http://schema.org/countriesSupported";
  public static final String CurrenciesAccepted = "http://schema.org/currenciesAccepted";
  public static final String DateCreated = "http://schema.org/dateCreated";
  public static final String DateIssued = "http://schema.org/dateIssued";
  public static final String DateModified = "http://schema.org/dateModified";
  public static final String DatePosted = "http://schema.org/datePosted";
  public static final String DatePublished = "http://schema.org/datePublished";
  public static final String DateTime = "http://schema.org/DateTime";
  public static final String Dateline = "http://schema.org/dateline";
  public static final String DeathDate = "http://schema.org/deathDate";
  public static final String DepartureGate = "http://schema.org/departureGate";
  public static final String DeparturePlatform = "http://schema.org/departurePlatform";
  public static final String DepartureTerminal = "http://schema.org/departureTerminal";
  public static final String DepartureTime = "http://schema.org/departureTime";
  public static final String Dependencies = "http://schema.org/dependencies";
  public static final String Device = "http://schema.org/device";
  public static final String DietFeatures = "http://schema.org/dietFeatures";
  public static final String Discount = "http://schema.org/discount";
  public static final String DiscountCode = "http://schema.org/discountCode";
  public static final String DiscountCurrency = "http://schema.org/discountCurrency";
  public static final String DiscussionUrl = "http://schema.org/discussionUrl";
  public static final String DissolutionDate = "http://schema.org/dissolutionDate";
  public static final String Distance = "http://schema.org/distance";
  public static final String DoorTime = "http://schema.org/doorTime";
  public static final String DosageForm = "http://schema.org/dosageForm";
  public static final String DoseUnit = "http://schema.org/doseUnit";
  public static final String DoseValue = "http://schema.org/doseValue";
  public static final String DownloadUrl = "http://schema.org/downloadUrl";
  public static final String DownvoteCount = "http://schema.org/downvoteCount";
  public static final String DropoffTime = "http://schema.org/dropoffTime";
  public static final String DrugUnit = "http://schema.org/drugUnit";
  public static final String Duns = "http://schema.org/duns";
  public static final String Duration = "http://schema.org/duration";
  public static final String EducationRequirements = "http://schema.org/educationRequirements";
  public static final String EducationalFramework = "http://schema.org/educationalFramework";
  public static final String EducationalRole = "http://schema.org/educationalRole";
  public static final String EducationalUse = "http://schema.org/educationalUse";
  public static final String Elevation = "http://schema.org/elevation";
  public static final String Email = "http://schema.org/email";
  public static final String EmbedUrl = "http://schema.org/embedUrl";
  public static final String EmploymentType = "http://schema.org/employmentType";
  public static final String EncodingFormat = "http://schema.org/encodingFormat";
  public static final String EncodingType = "http://schema.org/encodingType";
  public static final String EndDate = "http://schema.org/endDate";
  public static final String EndTime = "http://schema.org/endTime";
  public static final String Epidemiology = "http://schema.org/epidemiology";
  public static final String EpisodeNumber = "http://schema.org/episodeNumber";
  public static final String EstimatedFlightDuration = "http://schema.org/estimatedFlightDuration";
  public static final String EvidenceOrigin = "http://schema.org/evidenceOrigin";
  public static final String ExerciseType = "http://schema.org/exerciseType";
  public static final String ExifData = "http://schema.org/exifData";
  public static final String ExpectedArrivalFrom = "http://schema.org/expectedArrivalFrom";
  public static final String ExpectedArrivalUntil = "http://schema.org/expectedArrivalUntil";
  public static final String ExpectedPrognosis = "http://schema.org/expectedPrognosis";
  public static final String ExperienceRequirements = "http://schema.org/experienceRequirements";
  public static final String ExpertConsiderations = "http://schema.org/expertConsiderations";
  public static final String Expires = "http://schema.org/expires";
  public static final String FamilyName = "http://schema.org/familyName";
  public static final String FatContent = "http://schema.org/fatContent";
  public static final String FaxNumber = "http://schema.org/faxNumber";
  public static final String FeatureList = "http://schema.org/featureList";
  public static final String FiberContent = "http://schema.org/fiberContent";
  public static final String FileFormat = "http://schema.org/fileFormat";
  public static final String FileSize = "http://schema.org/fileSize";
  public static final String FlightDistance = "http://schema.org/flightDistance";
  public static final String FlightNumber = "http://schema.org/flightNumber";
  public static final String Followup = "http://schema.org/followup";
  public static final String FoodWarning = "http://schema.org/foodWarning";
  public static final String FoundingDate = "http://schema.org/foundingDate";
  public static final String Free = "http://schema.org/free";
  public static final String Frequency = "http://schema.org/frequency";
  public static final String FromLocation = "http://schema.org/fromLocation";
  public static final String Function = "http://schema.org/function";
  public static final String FunctionalClass = "http://schema.org/functionalClass";
  public static final String Gender = "http://schema.org/gender";
  public static final String Genre = "http://schema.org/genre";
  public static final String GivenName = "http://schema.org/givenName";
  public static final String GlobalLocationNumber = "http://schema.org/globalLocationNumber";
  public static final String Gtin13 = "http://schema.org/gtin13";
  public static final String Gtin14 = "http://schema.org/gtin14";
  public static final String Gtin8 = "http://schema.org/gtin8";
  public static final String GuidelineDate = "http://schema.org/guidelineDate";
  public static final String HasMap = "http://schema.org/hasMap";
  public static final String Headline = "http://schema.org/headline";
  public static final String HighPrice = "http://schema.org/highPrice";
  public static final String HonorificPrefix = "http://schema.org/honorificPrefix";
  public static final String HonorificSuffix = "http://schema.org/honorificSuffix";
  public static final String HowPerformed = "http://schema.org/howPerformed";
  public static final String HttpMethod = "http://schema.org/httpMethod";
  public static final String IataCode = "http://schema.org/iataCode";
  public static final String IcaoCode = "http://schema.org/icaoCode";
  public static final String Image = "http://schema.org/image";
  public static final String InLanguage = "http://schema.org/inLanguage";
  public static final String Incentives = "http://schema.org/incentives";
  public static final String Industry = "http://schema.org/industry";
  public static final String InfectiousAgent = "http://schema.org/infectiousAgent";
  public static final String Ingredients = "http://schema.org/ingredients";
  public static final String InstallUrl = "http://schema.org/installUrl";
  public static final String Intensity = "http://schema.org/intensity";
  public static final String InteractionCount = "http://schema.org/interactionCount";
  public static final String InteractivityType = "http://schema.org/interactivityType";
  public static final String IsAvailableGenerically = "http://schema.org/isAvailableGenerically";
  public static final String IsBasedOnUrl = "http://schema.org/isBasedOnUrl";
  public static final String IsFamilyFriendly = "http://schema.org/isFamilyFriendly";
  public static final String IsGift = "http://schema.org/isGift";
  public static final String IsProprietary = "http://schema.org/isProprietary";
  public static final String Isbn = "http://schema.org/isbn";
  public static final String IsicV4 = "http://schema.org/isicV4";
  public static final String Issn = "http://schema.org/issn";
  public static final String IssueNumber = "http://schema.org/issueNumber";
  public static final String ItemListElement = "http://schema.org/itemListElement";
  public static final String ItemListOrder = "http://schema.org/itemListOrder";
  public static final String JobTitle = "http://schema.org/jobTitle";
  public static final String Keywords = "http://schema.org/keywords";
  public static final String LabelDetails = "http://schema.org/labelDetails";
  public static final String LastReviewed = "http://schema.org/lastReviewed";
  public static final String Latitude = "http://schema.org/latitude";
  public static final String LearningResourceType = "http://schema.org/learningResourceType";
  public static final String LegalName = "http://schema.org/legalName";
  public static final String License = "http://schema.org/license";
  public static final String Line = "http://schema.org/line";
  public static final String LodgingUnitDescription = "http://schema.org/lodgingUnitDescription";
  public static final String Logo = "http://schema.org/logo";
  public static final String Longitude = "http://schema.org/longitude";
  public static final String LowPrice = "http://schema.org/lowPrice";
  public static final String Map = "http://schema.org/map";
  public static final String MaxPrice = "http://schema.org/maxPrice";
  public static final String MaxValue = "http://schema.org/maxValue";
  public static final String MealService = "http://schema.org/mealService";
  public static final String MechanismOfAction = "http://schema.org/mechanismOfAction";
  public static final String MembershipNumber = "http://schema.org/membershipNumber";
  public static final String MemoryRequirements = "http://schema.org/memoryRequirements";
  public static final String Menu = "http://schema.org/menu";
  public static final String MinPrice = "http://schema.org/minPrice";
  public static final String MinValue = "http://schema.org/minValue";
  public static final String ModifiedTime = "http://schema.org/modifiedTime";
  public static final String Mpn = "http://schema.org/mpn";
  public static final String MultipleValues = "http://schema.org/multipleValues";
  public static final String MuscleAction = "http://schema.org/muscleAction";
  public static final String Naics = "http://schema.org/naics";
  public static final String NamedPosition = "http://schema.org/namedPosition";
  public static final String NaturalProgression = "http://schema.org/naturalProgression";
  public static final String NonProprietaryName = "http://schema.org/nonProprietaryName";
  public static final String NormalRange = "http://schema.org/normalRange";
  public static final String NumAdults = "http://schema.org/numAdults";
  public static final String NumChildren = "http://schema.org/numChildren";
  public static final String NumTracks = "http://schema.org/numTracks";
  public static final String NumberOfEpisodes = "http://schema.org/numberOfEpisodes";
  public static final String NumberOfPages = "http://schema.org/numberOfPages";
  public static final String NumberOfSeasons = "http://schema.org/numberOfSeasons";
  public static final String OccupationalCategory = "http://schema.org/occupationalCategory";
  public static final String OfferCount = "http://schema.org/offerCount";
  public static final String OpeningHours = "http://schema.org/openingHours";
  public static final String Opens = "http://schema.org/opens";
  public static final String OperatingSystem = "http://schema.org/operatingSystem";
  public static final String OrderDate = "http://schema.org/orderDate";
  public static final String OrderNumber = "http://schema.org/orderNumber";
  public static final String Outcome = "http://schema.org/outcome";
  public static final String Overdosage = "http://schema.org/overdosage";
  public static final String Overview = "http://schema.org/overview";
  public static final String OwnedFrom = "http://schema.org/ownedFrom";
  public static final String OwnedThrough = "http://schema.org/ownedThrough";
  public static final String PageEnd = "http://schema.org/pageEnd";
  public static final String PageStart = "http://schema.org/pageStart";
  public static final String Pagination = "http://schema.org/pagination";
  public static final String PartySize = "http://schema.org/partySize";
  public static final String Pathophysiology = "http://schema.org/pathophysiology";
  public static final String PaymentAccepted = "http://schema.org/paymentAccepted";
  public static final String PaymentDue = "http://schema.org/paymentDue";
  public static final String PaymentMethodId = "http://schema.org/paymentMethodId";
  public static final String PaymentUrl = "http://schema.org/paymentUrl";
  public static final String Permissions = "http://schema.org/permissions";
  public static final String Phase = "http://schema.org/phase";
  public static final String PhysiologicalBenefits = "http://schema.org/physiologicalBenefits";
  public static final String PickupTime = "http://schema.org/pickupTime";
  public static final String PlayerType = "http://schema.org/playerType";
  public static final String Polygon = "http://schema.org/polygon";
  public static final String Population = "http://schema.org/population";
  public static final String Position = "http://schema.org/position";
  public static final String PossibleComplication = "http://schema.org/possibleComplication";
  public static final String PostOfficeBoxNumber = "http://schema.org/postOfficeBoxNumber";
  public static final String PostOp = "http://schema.org/postOp";
  public static final String PostalCode = "http://schema.org/postalCode";
  public static final String PreOp = "http://schema.org/preOp";
  public static final String PregnancyWarning = "http://schema.org/pregnancyWarning";
  public static final String PrepTime = "http://schema.org/prepTime";
  public static final String Preparation = "http://schema.org/preparation";
  public static final String PrescribingInfo = "http://schema.org/prescribingInfo";
  public static final String PreviousStartDate = "http://schema.org/previousStartDate";
  public static final String Price = "http://schema.org/price";
  public static final String PriceCurrency = "http://schema.org/priceCurrency";
  public static final String PriceRange = "http://schema.org/priceRange";
  public static final String PriceType = "http://schema.org/priceType";
  public static final String PriceValidUntil = "http://schema.org/priceValidUntil";
  public static final String PrintColumn = "http://schema.org/printColumn";
  public static final String PrintEdition = "http://schema.org/printEdition";
  public static final String PrintPage = "http://schema.org/printPage";
  public static final String PrintSection = "http://schema.org/printSection";
  public static final String Procedure = "http://schema.org/procedure";
  public static final String ProcessingTime = "http://schema.org/processingTime";
  public static final String ProcessorRequirements = "http://schema.org/processorRequirements";
  public static final String ProductID = "http://schema.org/productID";
  public static final String ProficiencyLevel = "http://schema.org/proficiencyLevel";
  public static final String ProgramName = "http://schema.org/programName";
  public static final String ProgrammingModel = "http://schema.org/programmingModel";
  public static final String ProprietaryName = "http://schema.org/proprietaryName";
  public static final String ProteinContent = "http://schema.org/proteinContent";
  public static final String PublicationType = "http://schema.org/publicationType";
  public static final String PublishingPrinciples = "http://schema.org/publishingPrinciples";
  public static final String Qualifications = "http://schema.org/qualifications";
  public static final String Question = "http://schema.org/question";
  public static final String RatingCount = "http://schema.org/ratingCount";
  public static final String RatingValue = "http://schema.org/ratingValue";
  public static final String ReadonlyValue = "http://schema.org/readonlyValue";
  public static final String RecipeCategory = "http://schema.org/recipeCategory";
  public static final String RecipeCuisine = "http://schema.org/recipeCuisine";
  public static final String RecipeInstructions = "http://schema.org/recipeInstructions";
  public static final String RecipeYield = "http://schema.org/recipeYield";
  public static final String RecommendationStrength = "http://schema.org/recommendationStrength";
  public static final String RelatedLink = "http://schema.org/relatedLink";
  public static final String ReleaseDate = "http://schema.org/releaseDate";
  public static final String ReleaseNotes = "http://schema.org/releaseNotes";
  public static final String Repetitions = "http://schema.org/repetitions";
  public static final String ReplyToUrl = "http://schema.org/replyToUrl";
  public static final String RepresentativeOfPage = "http://schema.org/representativeOfPage";
  public static final String RequiredGender = "http://schema.org/requiredGender";
  public static final String RequiredMaxAge = "http://schema.org/requiredMaxAge";
  public static final String RequiredMinAge = "http://schema.org/requiredMinAge";
  public static final String Requirements = "http://schema.org/requirements";
  public static final String RequiresSubscription = "http://schema.org/requiresSubscription";
  public static final String ReservationId = "http://schema.org/reservationId";
  public static final String Responsibilities = "http://schema.org/responsibilities";
  public static final String RestPeriods = "http://schema.org/restPeriods";
  public static final String ReviewBody = "http://schema.org/reviewBody";
  public static final String ReviewCount = "http://schema.org/reviewCount";
  public static final String Risks = "http://schema.org/risks";
  public static final String Runtime = "http://schema.org/runtime";
  public static final String SafetyConsideration = "http://schema.org/safetyConsideration";
  public static final String SalaryCurrency = "http://schema.org/salaryCurrency";
  public static final String SameAs = "http://schema.org/sameAs";
  public static final String SampleType = "http://schema.org/sampleType";
  public static final String SaturatedFatContent = "http://schema.org/saturatedFatContent";
  public static final String ScheduledTime = "http://schema.org/scheduledTime";
  public static final String Screenshot = "http://schema.org/screenshot";
  public static final String SeasonNumber = "http://schema.org/seasonNumber";
  public static final String SeatNumber = "http://schema.org/seatNumber";
  public static final String SeatRow = "http://schema.org/seatRow";
  public static final String SeatSection = "http://schema.org/seatSection";
  public static final String SerialNumber = "http://schema.org/serialNumber";
  public static final String ServesCuisine = "http://schema.org/servesCuisine";
  public static final String ServiceType = "http://schema.org/serviceType";
  public static final String ServiceUrl = "http://schema.org/serviceUrl";
  public static final String ServingSize = "http://schema.org/servingSize";
  public static final String Significance = "http://schema.org/significance";
  public static final String SignificantLink = "http://schema.org/significantLink";
  public static final String Skills = "http://schema.org/skills";
  public static final String Sku = "http://schema.org/sku";
  public static final String SodiumContent = "http://schema.org/sodiumContent";
  public static final String SoftwareVersion = "http://schema.org/softwareVersion";
  public static final String SpecialCommitments = "http://schema.org/specialCommitments";
  public static final String StageAsNumber = "http://schema.org/stageAsNumber";
  public static final String Status = "http://schema.org/status";
  public static final String StartDate = "http://schema.org/startDate";
  public static final String StartTime = "http://schema.org/startTime";
  public static final String Step = "http://schema.org/step";
  public static final String StepValue = "http://schema.org/stepValue";
  public static final String StorageRequirements = "http://schema.org/storageRequirements";
  public static final String StreetAddress = "http://schema.org/streetAddress";
  public static final String StrengthUnit = "http://schema.org/strengthUnit";
  public static final String StrengthValue = "http://schema.org/strengthValue";
  public static final String StructuralClass = "http://schema.org/structuralClass";
  public static final String SubStageSuffix = "http://schema.org/subStageSuffix";
  public static final String Subtype = "http://schema.org/subtype";
  public static final String SugarContent = "http://schema.org/sugarContent";
  public static final String SuggestedGender = "http://schema.org/suggestedGender";
  public static final String SuggestedMaxAge = "http://schema.org/suggestedMaxAge";
  public static final String SuggestedMinAge = "http://schema.org/suggestedMinAge";
  public static final String TargetDescription = "http://schema.org/targetDescription";
  public static final String TargetName = "http://schema.org/targetName";
  public static final String TargetPlatform = "http://schema.org/targetPlatform";
  public static final String TargetPopulation = "http://schema.org/targetPopulation";
  public static final String TargetUrl = "http://schema.org/targetUrl";
  public static final String TaxID = "http://schema.org/taxID";
  public static final String Telephone = "http://schema.org/telephone";
  public static final String Temporal = "http://schema.org/temporal";
  public static final String Text = "http://schema.org/text";
  public static final String ThumbnailUrl = "http://schema.org/thumbnailUrl";
  public static final String TickerSymbol = "http://schema.org/tickerSymbol";
  public static final String TicketNumber = "http://schema.org/ticketNumber";
  public static final String TicketToken = "http://schema.org/ticketToken";
  public static final String TimeRequired = "http://schema.org/timeRequired";
  public static final String TissueSample = "http://schema.org/tissueSample";
  public static final String Title = "http://schema.org/title";
  public static final String ToLocation = "http://schema.org/toLocation";
  public static final String TotalPrice = "http://schema.org/totalPrice";
  public static final String TotalTime = "http://schema.org/totalTime";
  public static final String TrackingNumber = "http://schema.org/trackingNumber";
  public static final String TrackingUrl = "http://schema.org/trackingUrl";
  public static final String TrainName = "http://schema.org/trainName";
  public static final String TrainNumber = "http://schema.org/trainNumber";
  public static final String TransFatContent = "http://schema.org/transFatContent";
  public static final String Transcript = "http://schema.org/transcript";
  public static final String TransmissionMethod = "http://schema.org/transmissionMethod";
  public static final String TypicalAgeRange = "http://schema.org/typicalAgeRange";
  public static final String UnitCode = "http://schema.org/unitCode";
  public static final String UnsaturatedFatContent = "http://schema.org/unsaturatedFatContent";
  public static final String UploadDate = "http://schema.org/uploadDate";
  public static final String UpvoteCount = "http://schema.org/upvoteCount";
  public static final String UrlTemplate = "http://schema.org/urlTemplate";
  public static final String ValidFor = "http://schema.org/validFor";
  public static final String ValidFrom = "http://schema.org/validFrom";
  public static final String ValidThrough = "http://schema.org/validThrough";
  public static final String ValidUntil = "http://schema.org/validUntil";
  public static final String Value = "http://schema.org/value";
  public static final String ValueAddedTaxIncluded = "http://schema.org/valueAddedTaxIncluded";
  public static final String ValueMaxLength = "http://schema.org/valueMaxLength";
  public static final String ValueMinLength = "http://schema.org/valueMinLength";
  public static final String ValueName = "http://schema.org/valueName";
  public static final String ValuePattern = "http://schema.org/valuePattern";
  public static final String ValueRequired = "http://schema.org/valueRequired";
  public static final String VatID = "http://schema.org/vatID";
  public static final String Version = "http://schema.org/version";
  public static final String VideoFrameSize = "http://schema.org/videoFrameSize";
  public static final String VideoQuality = "http://schema.org/videoQuality";
  public static final String VolumeNumber = "http://schema.org/volumeNumber";
  public static final String Warning = "http://schema.org/warning";
  public static final String WebCheckinTime = "http://schema.org/webCheckinTime";
  public static final String WordCount = "http://schema.org/wordCount";
  public static final String WorkHours = "http://schema.org/workHours";
  public static final String Workload = "http://schema.org/workload";
  public static final String WorstRating = "http://schema.org/worstRating";

  public static List<String> getAll() {
    return Arrays.asList(GeoJsonLineString,
            GeoJsonPolygon,
            GeoJsonMultiPoint,
            GeoJsonMultiLineString,
            GeoJsonMultiPolygon,
            QuantitativeValue,
            PropertyValueSpecification,
            Number,
            Enumeration,
            Altitude,
            AcceptsReservations,
            AccessCode,
            AccessibilityAPI,
            AccessibilityControl,
            AccessibilityFeature,
            AccessibilityHazard,
            Action,
            ActiveIngredient,
            ActivityDuration,
            ActivityFrequency,
            AdditionalName,
            AdditionalVariable,
            AddressLocality,
            AddressRegion,
            AdministrationRoute,
            AlcoholWarning,
            Algorithm,
            AlignmentType,
            AlternateName,
            AlternativeHeadline,
            AmountOfThisGood,
            AnswerCount,
            ApplicationCategory,
            ApplicationSubCategory,
            ApplicationSuite,
            ArrivalGate,
            ArrivalPlatform,
            ArrivalTerminal,
            ArrivalTime,
            ArticleBody,
            ArticleSection,
            Aspect,
            Assembly,
            AssemblyVersion,
            AssociatedPathophysiology,
            AudienceType,
            AvailabilityEnds,
            AvailabilityStarts,
            AvailableFrom,
            AvailableThrough,
            Award,
            Background,
            BaseSalary,
            Benefits,
            BestRating,
            BillingIncrement,
            BiomechnicalClass,
            BirthDate,
            Bitrate,
            BoardingGroup,
            BodyLocation,
            BookEdition,
            BookingTime,
            Boolean,
            Box,
            Breadcrumb,
            BreastfeedingWarning,
            BrowserRequirements,
            BusName,
            BusNumber,
            Calories,
            Caption,
            CarbohydrateContent,
            CarrierRequirements,
            CharacterName,
            CheckinTime,
            CheckoutTime,
            ChildMaxAge,
            ChildMinAge,
            CholesterolContent,
            Circle,
            ClincalPharmacology,
            ClipNumber,
            Closes,
            CodeRepository,
            CodeValue,
            CodingSystem,
            Color,
            CommentCount,
            CommentText,
            CommentTime,
            ConfirmationNumber,
            ContactType,
            ContentRating,
            ContentSize,
            ContentType,
            ContentUrl,
            CookTime,
            CookingMethod,
            CopyrightYear,
            CostCurrency,
            CostOrigin,
            CostPerUnit,
            CountriesNotSupported,
            CountriesSupported,
            CurrenciesAccepted,
            DateCreated,
            DateIssued,
            DateModified,
            DatePosted,
            DatePublished,
            DateTime,
            Dateline,
            DeathDate,
            DepartureGate,
            DeparturePlatform,
            DepartureTerminal,
            DepartureTime,
            Dependencies,
            Device,
            DietFeatures,
            Discount,
            DiscountCode,
            DiscountCurrency,
            DiscussionUrl,
            DissolutionDate,
            Distance,
            DoorTime,
            DosageForm,
            DoseUnit,
            DoseValue,
            DownloadUrl,
            DownvoteCount,
            DropoffTime,
            DrugUnit,
            Duns,
            Duration,
            EducationRequirements,
            EducationalFramework,
            EducationalRole,
            EducationalUse,
            Elevation,
            Email,
            EmbedUrl,
            EmploymentType,
            EncodingFormat,
            EncodingType,
            EndDate,
            EndTime,
            Epidemiology,
            EpisodeNumber,
            EstimatedFlightDuration,
            EvidenceOrigin,
            ExerciseType,
            ExifData,
            ExpectedArrivalFrom,
            ExpectedArrivalUntil,
            ExpectedPrognosis,
            ExperienceRequirements,
            ExpertConsiderations,
            Expires,
            FamilyName,
            FatContent,
            FaxNumber,
            FeatureList,
            FiberContent,
            FileFormat,
            FileSize,
            FlightDistance,
            FlightNumber,
            Followup,
            FoodWarning,
            FoundingDate,
            Free,
            Frequency,
            FromLocation,
            Function,
            FunctionalClass,
            Gender,
            Genre,
            GivenName,
            GlobalLocationNumber,
            Gtin13,
            Gtin14,
            Gtin8,
            GuidelineDate,
            HasMap,
            Headline,
            HighPrice,
            HonorificPrefix,
            HonorificSuffix,
            HowPerformed,
            HttpMethod,
            IataCode,
            IcaoCode,
            Image,
            InLanguage,
            Incentives,
            Industry,
            InfectiousAgent,
            Ingredients,
            InstallUrl,
            Intensity,
            InteractionCount,
            InteractivityType,
            IsAvailableGenerically,
            IsBasedOnUrl,
            IsFamilyFriendly,
            IsGift,
            IsProprietary,
            Isbn,
            IsicV4,
            Issn,
            IssueNumber,
            ItemListElement,
            ItemListOrder,
            JobTitle,
            Keywords,
            LabelDetails,
            LastReviewed,
            Latitude,
            LearningResourceType,
            LegalName,
            License,
            Line,
            LodgingUnitDescription,
            Logo,
            Longitude,
            LowPrice,
            Map,
            MaxPrice,
            MaxValue,
            MealService,
            MechanismOfAction,
            MembershipNumber,
            MemoryRequirements,
            Menu,
            MinPrice,
            MinValue,
            ModifiedTime,
            Mpn,
            MultipleValues,
            MuscleAction,
            Naics,
            NamedPosition,
            NaturalProgression,
            NonProprietaryName,
            NormalRange,
            NumAdults,
            NumChildren,
            NumTracks,
            NumberOfEpisodes,
            NumberOfPages,
            NumberOfSeasons,
            OccupationalCategory,
            OfferCount,
            OpeningHours,
            Opens,
            OperatingSystem,
            OrderDate,
            OrderNumber,
            Outcome,
            Overdosage,
            Overview,
            OwnedFrom,
            OwnedThrough,
            PageEnd,
            PageStart,
            Pagination,
            PartySize,
            Pathophysiology,
            PaymentAccepted,
            PaymentDue,
            PaymentMethodId,
            PaymentUrl,
            Permissions,
            Phase,
            PhysiologicalBenefits,
            PickupTime,
            PlayerType,
            Polygon,
            Population,
            Position,
            PossibleComplication,
            PostOfficeBoxNumber,
            PostOp,
            PostalCode,
            PreOp,
            PregnancyWarning,
            PrepTime,
            Preparation,
            PrescribingInfo,
            PreviousStartDate,
            Price,
            PriceCurrency,
            PriceRange,
            PriceType,
            PriceValidUntil,
            PrintColumn,
            PrintEdition,
            PrintPage,
            PrintSection,
            Procedure,
            ProcessingTime,
            ProcessorRequirements,
            ProductID,
            ProficiencyLevel,
            ProgramName,
            ProgrammingModel,
            ProprietaryName,
            ProteinContent,
            PublicationType,
            PublishingPrinciples,
            Qualifications,
            Question,
            RatingCount,
            RatingValue,
            ReadonlyValue,
            RecipeCategory,
            RecipeCuisine,
            RecipeInstructions,
            RecipeYield,
            RecommendationStrength,
            RelatedLink,
            ReleaseDate,
            ReleaseNotes,
            Repetitions,
            ReplyToUrl,
            RepresentativeOfPage,
            RequiredGender,
            RequiredMaxAge,
            RequiredMinAge,
            Requirements,
            RequiresSubscription,
            ReservationId,
            Responsibilities,
            RestPeriods,
            ReviewBody,
            ReviewCount,
            Risks,
            Runtime,
            SafetyConsideration,
            SalaryCurrency,
            SameAs,
            SampleType,
            SaturatedFatContent,
            ScheduledTime,
            Screenshot,
            SeasonNumber,
            SeatNumber,
            SeatRow,
            SeatSection,
            SerialNumber,
            ServesCuisine,
            ServiceType,
            ServiceUrl,
            ServingSize,
            Significance,
            SignificantLink,
            Skills,
            Sku,
            SodiumContent,
            SoftwareVersion,
            SpecialCommitments,
            StageAsNumber,
            StartDate,
            StartTime,
            Step,
            StepValue,
            StorageRequirements,
            StreetAddress,
            StrengthUnit,
            StrengthValue,
            StructuralClass,
            SubStageSuffix,
            Subtype,
            SugarContent,
            SuggestedGender,
            SuggestedMaxAge,
            SuggestedMinAge,
            TargetDescription,
            TargetName,
            TargetPlatform,
            TargetPopulation,
            TargetUrl,
            TaxID,
            Telephone,
            Temporal,
            Text,
            ThumbnailUrl,
            TickerSymbol,
            TicketNumber,
            TicketToken,
            TimeRequired,
            TissueSample,
            Title,
            ToLocation,
            TotalPrice,
            TotalTime,
            TrackingNumber,
            TrackingUrl,
            TrainName,
            TrainNumber,
            TransFatContent,
            Transcript,
            TransmissionMethod,
            TypicalAgeRange,
            UnitCode,
            UnsaturatedFatContent,
            UploadDate,
            UpvoteCount,
            UrlTemplate,
            ValidFor,
            ValidFrom,
            ValidThrough,
            ValidUntil,
            Value,
            ValueAddedTaxIncluded,
            ValueMaxLength,
            ValueMinLength,
            ValueName,
            ValuePattern,
            ValueRequired,
            VatID,
            Version,
            VideoFrameSize,
            VideoQuality,
            VolumeNumber,
            Warning,
            WebCheckinTime,
            WordCount,
            WorkHours,
            Workload,
            WorstRating);
  }
}
