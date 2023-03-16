import styles from '../Header/Header.module.css';
import Container from 'react-bootstrap/Container';
import Navbar from 'react-bootstrap/Navbar';
import Logo from '../../assets/img/logo.png';
import LoginAccount from './LoginAccount/LoginAccount';

function Header() {
	return (
		<>
			<header className={styles.a}>
				<Navbar style={{ background: '#272626' }}>
					<Container>
						<Navbar.Brand href='#home'>
							<img alt='' src={Logo} width='240' height='70' className='d-inline-block align-top' />{' '}
						</Navbar.Brand>
						<Navbar.Collapse className='justify-content-end align-center'>
							<Navbar.Text>
								<LoginAccount />
							</Navbar.Text>
						</Navbar.Collapse>
					</Container>
				</Navbar>
			</header>
		</>
	);
}

export default Header;
