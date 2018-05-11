#!/usr/bin/python
# -*- coding: utf-8 -*-

from flask import *
import json
import mysql.connector

# Créer l'objet Application Flask (Serveur)
app = Flask( __name__ )

# Obtenir une connexion au SGBDR
connexionBD = mysql.connector.connect(
			host = 'localhost' ,
			user = 'root' ,
			password = 'azerty' ,
			database = 'Gsb'
		)

# Page d'accueil
@app.route( '/' )
def accueil() :
	# Retourne un simple message (texte brut)
	return "Client GSB Android"



@app.route( '/connexion/<idV>.<mdp>' , methods=['GET'] )
def connexionVisiteur(idV, mdp) :
	# Obtenir un curseur
	curseur = connexionBD.cursor()
	# Exécuter la requête
	curseur.execute( 'select VIS_MATRICULE, VIS_NOM, VIS_PRENOM, VIS_MDP from VISITEUR WHERE VIS_MATRICULE = %s AND VIS_MDP = %s', (idV, mdp) )
	# Lire tous les tuples qui résultent de l'exécution de la requête
	tuples = curseur.fetchall()
	# Fermer le curseur
	curseur.close()
	# Créer une liste vide de visiteurs
	visiteurs = []
	# Parcourir tous les tuples qui résultent de l'exécution de la requête
	for unTuple in tuples :
		# Convertir le tuple en dictionnaire (tableau associatif)
		unVisiteur = { 'id': unTuple[0] , 'nom': unTuple[1] , 'prenom': unTuple[2], 'mdp':unTuple[3] }
		# Ajouter le dictionnaire dans la liste des livreurs
		
	
	# Convertir la liste des livreurs en chaîne au format JSON
	reponse = json.dumps(unVisiteur)
	print "Visiteur : " + reponse
	# Renvoyer la réponse au client HTTP
	return Response( reponse , status=200 , mimetype='application/json' ) 




# Liste des Visiteurs

@app.route( '/Visiteur' , methods=['GET'] )
def getLesVisiteurs() :
	# Obtenir un curseur
	curseur = connexionBD.cursor()
	# Exécuter la requête
	curseur.execute( 'select VIS_MATRICULE, VIS_NOM, VIS_PRENOM, VIS_ADRESSE, VIS_CP, VIS_VILLE, CONVERT(VIS_DATEEMBAUCHE, CHAR), SEC_CODE, LAB_CODE, VIS_MDP from VISITEUR' )
	# Lire tous les tuples qui résultent de l'exécution de la requête
	tuples = curseur.fetchall()
	# Fermer le curseur
	curseur.close()
	# Créer une liste vide de visiteurs
	visiteurs = []
	# Parcourir tous les tuples qui résultent de l'exécution de la requête
	for unTuple in tuples :
		# Convertir le tuple en dictionnaire (tableau associatif)
		unVisiteur = { 'id': unTuple[0] , 'nom': unTuple[1] , 'prenom': unTuple[2], 'adresse':unTuple[3], 'cp':unTuple[4], 'ville':unTuple[5], 'dateEmbauche':unTuple[6], 'codeSec':unTuple[7], 'codeLab':unTuple[8], 'mdp':unTuple[9] }
		# Ajouter le dictionnaire dans la liste des visiteurs
		visiteurs.append( unVisiteur )
	# Convertir la liste des visiteurs en chaîne au format JSON
	reponse = json.dumps( visiteurs )
	print "Visiteur : " + reponse
	# Renvoyer la réponse au client HTTP
	return Response( reponse , status=200 , mimetype='application/json' ) 


# Liste des RV 

@app.route( '/listeRV/<idV>.<mois>.<annee>' , methods=['GET'] )
def getLesRapportsVisite(idV, mois, annee) :
	pass
	# Obtenir un curseur
	curseur = connexionBD.cursor()
	# Exécuter la requête
	curseur.execute( 'Select R.VIS_MATRICULE, R.RAP_NUM, R.PRA_NUM, R.RAP_BILAN, R.RAP_VU, R.RAP_DATE, R.RAP_MOTIF, R.RAP_COEFCONFIANCE, P.PRA_NOM, P.PRA_PRENOM From RAPPORT_VISITE R INNER JOIN PRATICIEN P ON R.PRA_NUM = P.PRA_NUM '
					+'Where MONTH(RAP_DATE) = %s AND YEAR(RAP_DATE) = %s AND VIS_MATRICULE = %s' , (mois, annee, idV))
	# Lire tous les tuples qui résultent de l'exécution de la requête
	tuples = curseur.fetchall()
	# Fermer le curseur
	curseur.close()
	#Liste de rapport de visite
	RapportsVisites = []
	# valeur null si pas de tuple
	i = 0
	# Parcourir tous les tuples qui résultent de l'exécution de la requête
	for unTuple in tuples :
		i += 1

	if i == 0 :
		unRv = {}
		RapportsVisites.append( unRv )
	else :
		for unTuple in tuples :
		# Convertir le tuple en un RV (tableau associatif)
			unRv = { 'VIS_MATRICULE': unTuple[0] , 'RAP_NUM': unTuple[1] , 'PRA_NUM': unTuple[2], 'RAP_BILAN': unTuple[3],
			'RAP_VU': unTuple[4], 'RAP_DATE': str(unTuple[5]), 'RAP_MOTIF': unTuple[6], 'RAP_COEFCONFIANCE': unTuple[7], 'NomP' : unTuple[8], 'PrenomP' : unTuple[9]}
			# Ajouter le dictionnaire dans la liste des RV
			RapportsVisites.append( unRv )

	# Convertir la liste des livreurs en chaîne au format JSON
	response = json.dumps( RapportsVisites )
	print "Rapports de Visite : " + response
	# Renvoyer la réponse au client HTTP
	return Response( response , status=200 , mimetype='application/json' )




# Liste des échantillons par rapport à un RV

@app.route( '/echantillons/<num>.<matricule>' , methods=['GET'] )
def getEchantillons( num, matricule ) :
	# Obtenir un curseur
	curseur = connexionBD.cursor()

	# Exécuter la requête
	curseur.execute( 'select m.MED_DEPOTLEGAL, m.MED_NOMCOMMERCIAL, f.FAM_LIBELLE, m.MED_COMPOSITION, m.MED_EFFETS, m.MED_CONTREINDIC, m.MED_PRIXECHANTILLON, o.QUANTITE '
	+'FROM MEDICAMENT m '
	+'INNER JOIN FAMILLE f '
	+'ON m.FAM_CODE = f.FAM_CODE '
	+'INNER JOIN OFFRIR o '
	+'ON m.MED_DEPOTLEGAL = o.MED_DEPOTLEGAL '
	+' Where o.RAP_NUM = %s AND o.VIS_MATRICULE = %s' , (num, matricule)  )
	# Lire tous les tuples qui résultent de l'exécution de la requête
	tuples = curseur.fetchall()
	# Fermer le curseur
	curseur.close()
	# Créer une liste vide d'échantillons
	echantillons = []
	#Si il n'y a pas de tuple echantillons prend la valeur null
	i = 0
	for tupleExiste in tuples :

		i += 1
		
	if i == 0 :

		unEchantillon = {}
		echantillons.append( unEchantillon )

	else :
		# Parcourir tous les tuples qui résultent de l'exécution de la requête
		for unTuple in tuples :
			# Convertir le tuple en dictionnaire (tableau associatif)
			unEchantillon = { 'depotLegal': unTuple[0] , 'nomCommercial': unTuple[1] ,
			'famLibelle': unTuple[2] , 'composition' : unTuple[3] ,
			'effets': unTuple[4] , 'contreIndications' : unTuple[5] ,
			'prixEchantillon': unTuple[6] , 'quantite': unTuple[7] }


			# Ajouter le dictionnaire dans la liste des echantillons
			echantillons.append( unEchantillon )

	# Convertir la liste des echantillons en chaîne au format JSON
	reponse = json.dumps( echantillons )
	print "echantillons : " + reponse
	# Renvoyer la réponse au client HTTP
	return Response( reponse , status=200 , mimetype='application/json' )


# Liste des Praticiens

@app.route( '/praticiens' , methods=['GET'] )
def getPraticiens() :
	# Obtenir un curseur
	curseur = connexionBD.cursor()
	# Exécuter la requête
	curseur.execute( 'select * '
	+ 'FROM PRATICIEN')
	# Lire tous les tuples qui résultent de l'exécution de la requête
	tuples = curseur.fetchall()
	# Fermer le curseur
	curseur.close()
	# Créer une liste vide de praticiens
	praticiens = []
	#Si il n'y a pas de tuple praticiens prend la valeur null
	i = 0
	for tupleExiste in tuples :

		i += 1

	if i == 0 :

		unPraticien = {}
		praticiens.append( unPraticien )

	else :
		# Parcourir tous les tuples qui résultent de l'exécution de la requête
		for unTuple in tuples :
			# Convertir le tuple en dictionnaire (tableau associatif)
			unPraticien = { 'num': unTuple[0] , 'nom': unTuple[1] , 'prenom': unTuple[2] , 'adresse' : unTuple[3] , 'cp' : unTuple[4] , 'ville' : unTuple[5], 'coefNotoriete' : unTuple[6] , 'code' : unTuple[7]  }


			# Ajouter le dictionnaire dans la liste des praticiens
			praticiens.append( unPraticien )

	# Convertir la liste des praticiens en chaîne au format JSON
	reponse = json.dumps( praticiens )
	print "Praticiens : " + reponse
	# Renvoyer la réponse au client HTTP
	return Response( reponse , status=200 , mimetype='application/json' )


# Programme principal
if __name__ == "__main__" :
	# Démarrer le serveur
	app.run( debug = True , host = '192.168.220.130' , port = 5000 )
