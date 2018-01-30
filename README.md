## UniREST - Java Client for REST

Requisitos de software previamente instalado:

	+ Java 1.8
	+ Apache Maven
	+ Python 2.7
	+ Python PIP
	
Descargar servidor en python:

	$ git clone https://github.com/pepeul1191/agricultor-python agricultor
	$ cd agricultor
	$ sudo pip install -r requirements.txt

Instalación de dependencias:

	$  mvn eclipse:eclipse && mvn install
	
En el proyecto python, en el archivo "views/responsables.py", añadir:

```python
@responsable.route('/responsable/test', methods=['POST'])
def test_post():
	print("1 +++++++++++++++++++++++++++++++")
	print(request.args['data'])
	print("2 +++++++++++++++++++++++++++++++")
	data = json.loads(request.args['data'])
	try:
		print(data)
		rpta = {'tipo_mensaje' : 'success', 'mensaje' : ['Se ha registrado los test', array_nuevos]}
	except Exception as e:
		rpta = {'tipo_mensaje' : 'error', 'mensaje' : ['Se ha producido un error en test', str(e)]}
	return json.dumps(rpta)

```

	
### Fuentes externas:

+ http://unirest.io/java.html
+ https://github.com/pepeul1191/java-accesos
+ https://github.com/pepeul1191/agricultor-python

---

 Thanks/Credits

    Pepe Valdivia: developer Software Web Perú [http://softweb.pe]
